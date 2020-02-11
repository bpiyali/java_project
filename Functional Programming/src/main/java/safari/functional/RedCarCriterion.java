package safari.functional;

public class RedCarCriterion implements CarCriterion {
    @Override
    public boolean test(Car car) {
        return car.getColor().equals("Red");
    }
}
