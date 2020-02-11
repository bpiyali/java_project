package pluralsight.chapter1;

public class RaceCondition {
    public static void main(String[] args)  throws InterruptedException{
        LongWrapper longWrapper = new LongWrapper(0);
        Runnable runnable = () -> {
            for(int i=0; i<1000; i++){
                longWrapper.incrementValue();
            }
        };

//        Thread t = new Thread(runnable);
//        t.start();
//
//        t.join();
//        System.out.println(longWrapper.getValue());

        Thread[] thread = new Thread[1000];
        for(int i=0; i<1000; i++){
            thread[i] = new Thread(runnable);
            thread[i].start();
        }

        for(int i=0; i<1000; i++){
            thread[i].join();
        }

        System.out.println("Value: ="+ longWrapper.getValue());
    }
}
