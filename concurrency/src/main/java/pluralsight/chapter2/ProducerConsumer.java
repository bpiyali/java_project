package pluralsight.chapter2;

public class ProducerConsumer {
    private static int[] buffer;
    private static int count;
    private static final Object lock = new Object();

    static class Producer{
        void produce() {
            synchronized (lock) {
//                while(isFull(buffer)){}
                if (isFull(buffer)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[count++] = 1;
                lock.notifyAll();
            }
        }
    }

    static class Consumer{
        void consume(){
            synchronized (lock) {
//                while (isEmpty(buffer)) { }
                if (isEmpty()) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                buffer[--count] = 0;
                lock.notifyAll();
            }
        }
    }

    static boolean isEmpty() {
        return count == 0;
    }

    static boolean isFull(int[] buffer) {
        return count == buffer.length;
    }

    public static void main(String[] args) throws InterruptedException{
        buffer = new int[10];
        count = 0;
        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable produce = () -> {
            for(int i=0; i<50; i++)
                producer.produce();
            System.out.println("Done Producing");
        };

        Runnable consume = () -> {
            for(int i=0; i<50; i++)
                consumer.consume();
            System.out.println("Done Consuming");
        };

        Thread producerThread = new Thread(produce);
        Thread consumerThread = new Thread(consume);

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();

        System.out.println("Count: "+count);
    }
}
