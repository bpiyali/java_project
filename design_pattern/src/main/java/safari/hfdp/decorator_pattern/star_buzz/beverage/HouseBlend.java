package safari.hfdp.decorator_pattern.star_buzz.beverage;

public class HouseBlend extends CoffeeBeverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        return 0.89;
    }
}
