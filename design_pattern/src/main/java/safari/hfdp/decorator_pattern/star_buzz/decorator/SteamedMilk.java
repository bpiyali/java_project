package safari.hfdp.decorator_pattern.star_buzz.decorator;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public class SteamedMilk extends CondimentsDecorator {
    CoffeeBeverage coffeeBeverage;

    public SteamedMilk(CoffeeBeverage coffeeBeverage) {
        this.coffeeBeverage = coffeeBeverage;
    }

    public String getDescription() {
        return coffeeBeverage.getDescription() + ", Steamed Milk";
    }

    public double cost() {
        return coffeeBeverage.cost() + 0.10;
    }
}
