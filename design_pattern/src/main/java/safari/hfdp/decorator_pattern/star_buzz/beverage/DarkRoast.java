package safari.hfdp.decorator_pattern.star_buzz.beverage;

public class DarkRoast extends CoffeeBeverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    public double cost() {
        return 0.99;
    }
}
