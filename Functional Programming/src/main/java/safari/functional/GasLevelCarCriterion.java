package safari.functional;

public class GasLevelCarCriterion implements CarCriterion {
    private int threshold;

    public GasLevelCarCriterion(int threshold) {
        this.threshold = threshold;
    }

    @Override
    public boolean test(Car car) {
        return car.getGasLevel() >= threshold;
    }
}
