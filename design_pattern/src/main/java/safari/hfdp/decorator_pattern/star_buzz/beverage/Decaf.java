package safari.hfdp.decorator_pattern.star_buzz.beverage;

public class Decaf extends CoffeeBeverage {
    public Decaf() {
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
