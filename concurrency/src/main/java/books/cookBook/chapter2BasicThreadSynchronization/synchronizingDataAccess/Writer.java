package books.cookBook.chapter2BasicThreadSynchronization.synchronizingDataAccess;

import java.util.Date;

public class Writer implements Runnable {

    private  PricesInfo pricesInfo;

    public Writer(PricesInfo pricesInfo) {
        this.pricesInfo = pricesInfo;
    }

    public void run() {
        for(int i=0; i<5; i++){
            System.out.printf("Write Info: %s Trying to modify the prices: %s \n", Thread.currentThread().getName(), new Date());
            pricesInfo.setPrices(Math.random()*10, Math.random()*8);
            System.out.printf("Write Info: %s modification of prices is completed %s \n", Thread.currentThread().getName(), new Date());
            try{
                Thread.sleep(2);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
