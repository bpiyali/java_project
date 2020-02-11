package books.cookBook.chapter2BasicThreadSynchronization.usingConditions;

// created by: bandypiy
// Date: 10/22/2018

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class EventStorage {
    private int maxSize;
    private Queue<Date> storage;

    public EventStorage() {
        this.maxSize = 10;
        storage = new LinkedList<Date>();
    }

    public synchronized void set(){
        while(storage.size() == maxSize){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        storage.offer(new Date());
        System.out.printf("Set %d \n", storage.size());
        notify();
    }

    public synchronized void get(){
        while (storage.size() == 0){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        String element = storage.poll().toString();
        System.out.printf("Get %d, %s \n", storage.size(), element);
        notify();
    }
}
