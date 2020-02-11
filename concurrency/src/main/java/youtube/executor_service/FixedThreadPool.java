package youtube.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        int coreCount = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(coreCount);
        for(int i=0; i<1000; i++) {
            //Thread t = new Thread(new Task());
            //t.start();
            service.execute(new Task());
        }
        System.out.println("Thread Name: "+ Thread.currentThread().getName());
    }
}
