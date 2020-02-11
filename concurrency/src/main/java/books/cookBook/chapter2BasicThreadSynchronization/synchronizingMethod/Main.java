package books.cookBook.chapter2BasicThreadSynchronization.synchronizingMethod;

// created by: bandypiy
// Date: 10/22/2018

public class Main {
    public static void main(String[] args) {
        ParkingCash cash = new ParkingCash();
        ParkingStats stats = new ParkingStats(cash);
        System.out.println("Parking Simulation: \n");
        int numberSensors = 2* Runtime.getRuntime().availableProcessors();
        Thread threads[] = new Thread[numberSensors];
        for(int i=0; i<numberSensors; i++){
            Sensor sensor = new Sensor(stats);
            Thread thread = new Thread(sensor);
            thread.start();
            threads[i] = thread;
        }
        for(int i=0; i<numberSensors; i++){
            try {
                threads[i].join();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Number of Cars: "+ stats.getNoOfCars());
        System.out.println("Number of MotorCycles: "+ stats.getNoOfMotorCycles());
        cash.close();
    }
}
