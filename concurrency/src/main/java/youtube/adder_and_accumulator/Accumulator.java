package youtube.adder_and_accumulator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class Accumulator {
    private static class Task implements Runnable {
        private final LongAccumulator counter;

        public Task(LongAccumulator counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            counter.accumulate(2);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LongAccumulator counter = new LongAccumulator((x, y) -> x + y, 0);
        ExecutorService service = Executors.newFixedThreadPool(16);
        for(int i=0; i<100; i++) {
            service.submit(new Task(counter));
            Thread.sleep(20);
        }
        System.out.println(counter.get());
    }
}
