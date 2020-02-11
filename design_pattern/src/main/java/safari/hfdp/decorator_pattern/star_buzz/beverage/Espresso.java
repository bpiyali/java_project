package safari.hfdp.decorator_pattern.star_buzz.beverage;

public class Espresso extends CoffeeBeverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.9;
    }
}
