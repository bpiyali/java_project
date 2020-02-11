package books.cookBook.chapter2BasicThreadSynchronization.synchronizingMethod;

// created by: bandypiy
// Date: 10/22/2018

import java.util.concurrent.TimeUnit;

public class Sensor implements Runnable {
    private ParkingStats parkingStats;

    public Sensor(ParkingStats parkingStats) {
        this.parkingStats = parkingStats;
    }

    public void run() {
        for(int i=0; i<10; i++){
            parkingStats.carsComeIn();
            parkingStats.carsComeIn();
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            parkingStats.motorComesIn();
            try{
                TimeUnit.MILLISECONDS.sleep(50);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

            parkingStats.carsGoesOut();
            parkingStats.motorGetsOut();
            parkingStats.carsGoesOut();
        }
    }
}
