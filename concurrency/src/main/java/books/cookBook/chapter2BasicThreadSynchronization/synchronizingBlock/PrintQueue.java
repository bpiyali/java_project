package books.cookBook.chapter2BasicThreadSynchronization.synchronizingBlock;

// created by: bandypiy
// Date: 10/22/2018

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrintQueue {
    private Lock queueLock;

    public PrintQueue(boolean fairLock) {
        this.queueLock = new ReentrantLock(fairLock);
    }

    public void printJob(Object Document){
        queueLock.lock();
        try{
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()+ " PrintQueue: Printing a job during: "+duration/1000+" seconds");
            Thread.sleep(duration);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            queueLock.unlock();
        }

        queueLock.lock();
        try{
            Long duration = (long) (Math.random() * 10000);
            System.out.println(Thread.currentThread().getName()+ " PrintQueue: Printing a job during: "+duration/1000+" seconds");
            Thread.sleep(duration);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            queueLock.unlock();
        }
    }
}
