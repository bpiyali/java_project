package books.cookBook.chapter1.threadsFactory;

// created by: bandypiy
// Date: 10/22/2018

import java.util.concurrent.TimeUnit;

public class Task implements Runnable {
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
