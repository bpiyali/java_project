package youtube.executor_service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=0; i<1000; i++){
            service.execute(new Task());
        }
    }
}
