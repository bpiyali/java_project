package books.cookBook.chapter2BasicThreadSynchronization.synchronizingDataAccess;

import java.util.Date;

public class Reader implements Runnable {

    private PricesInfo pricesInfo;

    public Reader(PricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    public void run() {
        for(int i=0; i<20; i++) {
            System.out.printf("%s: Price 1: %s %f \n", new Date(), Thread.currentThread().getName(), pricesInfo.getPrice1());
            System.out.printf("%s: Price 2: %s %f \n", new Date(), Thread.currentThread().getName(), pricesInfo.getPrice2());
        }
    }
}
