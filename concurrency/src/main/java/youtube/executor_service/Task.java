package youtube.executor_service;

public class Task implements Runnable {
    public void run() {
        System.out.println("Thread: "+Thread.currentThread().getName());
    }
}
