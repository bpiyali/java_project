package books.cookBook.chapter2BasicThreadSynchronization.synchronizingBlock;

// created by: bandypiy
// Date: 10/22/2018

public class Job implements Runnable {
    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    public void run() {
        System.out.println("Going to print a document.."+ Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.println("Printing document is completed.. "+ Thread.currentThread().getName());
    }
}
