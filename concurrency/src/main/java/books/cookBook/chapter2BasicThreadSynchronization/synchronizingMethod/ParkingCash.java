package books.cookBook.chapter2BasicThreadSynchronization.synchronizingMethod;

// created by: bandypiy
// Date: 10/22/2018

public class ParkingCash {
    private long cash;
    private static final int cost = 2;

    public ParkingCash(){
        this.cash = 0;
    }

    public synchronized void vehiclePay(){
        this.cash += cost;
    }

    public void close(){
        System.out.println("************ Closing Account ************");
        long totalCash;
        synchronized (this) {
            totalCash = this.cash;
            this.cash = 0;
        }
        System.out.println("Total Amount is: "+ totalCash);
    }
}
