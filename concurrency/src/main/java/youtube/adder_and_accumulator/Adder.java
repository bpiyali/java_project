package youtube.adder_and_accumulator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Adder {
    private static class Task implements Runnable{
        private final LongAdder counter;
        public Task(LongAdder counter){
            this.counter = counter;
        }
        @Override
        public void run() {
            counter.increment();
        }

    }
    public static void main(String[] args) throws InterruptedException {
        LongAdder counter = new LongAdder();
        ExecutorService service = Executors.newFixedThreadPool(16);
        for(int i=0; i<100; i++) {
            service.submit(new Task(counter));
            Thread.sleep(20);
        }
        System.out.println(counter.sum());
    }

}
