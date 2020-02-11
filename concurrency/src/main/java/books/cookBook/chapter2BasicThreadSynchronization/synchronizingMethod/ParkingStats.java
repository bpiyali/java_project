package books.cookBook.chapter2BasicThreadSynchronization.synchronizingMethod;

// created by: bandypiy
// Date: 10/22/2018

public class ParkingStats {
    private int noOfCars;
    private int noOfMotorCycles;
    private ParkingCash cash;
    private final Object controlCars, controlMotors;

    public ParkingStats(ParkingCash parkingCash) {
        this.cash = parkingCash;
        this.noOfCars = 0;
        this.noOfMotorCycles = 0;
        controlCars = new Object();
        controlMotors = new Object();
    }

    public void carsComeIn(){
        synchronized (controlCars) {
            noOfCars++;
        }
    }
    public void carsGoesOut(){
        synchronized (controlCars) {
            noOfCars--;
        }
        cash.vehiclePay();
    }
    public void motorComesIn(){
        synchronized (controlMotors) {
            noOfMotorCycles++;
        }
    }
    public void motorGetsOut(){
        synchronized (controlMotors) {
            noOfMotorCycles--;
        }
        cash.vehiclePay();
    }

    public int getNoOfCars() {
        return this.noOfCars;
    }

    public int getNoOfMotorCycles() {
        return this.noOfMotorCycles;
    }
}
