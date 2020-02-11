package safari.hfdp.decorator_pattern.star_buzz.decorator;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public class Mocha extends CondimentsDecorator {
    CoffeeBeverage coffeeBeverage;
    public Mocha(CoffeeBeverage coffeeBeverage) {
        this.coffeeBeverage = coffeeBeverage;
    }

    public String getDescription() {
        return coffeeBeverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return coffeeBeverage.cost() + .20;
    }
}
