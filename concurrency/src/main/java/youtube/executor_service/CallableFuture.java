package youtube.executor_service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableFuture {
    public static void main(String[] args){
        int core = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future> futureList = new ArrayList<Future>();
        for(int i=0; i<100; i++) {
            Future<Integer> future = service.submit(new Task());
            futureList.add(future);
        }
        for(int i=0; i<100; i++){
            Future<Integer> future = futureList.get(i);
            Integer result = null;
            try {
                result = future.get(1, TimeUnit.SECONDS);
            } catch (TimeoutException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
            System.out.println("Result "+ i+": "+result);
        }
    }

    static class Task implements Callable<Integer>{

        public Integer call() throws Exception {
            Thread.sleep(300);
            System.out.println("Thread "+ Thread.currentThread().getName());
            return new Random().nextInt();
        }
    }
}
