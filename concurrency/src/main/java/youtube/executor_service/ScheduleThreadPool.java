package youtube.executor_service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleThreadPool {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
        service.schedule(new Task(),10, TimeUnit.SECONDS);
        service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(new Task(),5, 10, TimeUnit.SECONDS);
    }
}
