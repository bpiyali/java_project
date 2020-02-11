package books.cookBook.chapter2BasicThreadSynchronization.synchronizingBlock;

// created by: bandypiy
// Date: 10/22/2018

public class Main {
    public static void main(String[] args) {
        System.out.println("Running example with fair-mode = false \n");
        testPrintQueue(false);
        System.out.println("Running example with fair-mode = true \n");
        testPrintQueue(true);
    }

    private static void testPrintQueue(boolean fairMode) {
        PrintQueue printQueue = new PrintQueue(fairMode);
        Thread thread[] = new Thread[10];
        for(int i=0; i<10; i++){
            thread[i] = new Thread(new Job(printQueue), "Thread"+i);
        }
        for(int i=0; i<10; i++){
            thread[i].start();
        }
        for(int i=0; i<10; i++){
            try{
                thread[i].join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
