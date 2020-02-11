package books.cookBook.chapter2BasicThreadSynchronization.usingConditions;

// created by: bandypiy
// Date: 10/22/2018

public class Consumer implements Runnable {
    private EventStorage storage;

    public Consumer(EventStorage storage) {
        this.storage = storage;
    }

    public void run() {
       for(int i=0; i<10; i++){
           storage.get();
       }
    }
}
