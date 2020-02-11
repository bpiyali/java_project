package safari.hfdp.decorator_pattern.star_buzz.decorator;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public class Whip extends CondimentsDecorator{
    CoffeeBeverage coffeeBeverage;

    public Whip(CoffeeBeverage coffeeBeverage) {
        this.coffeeBeverage = coffeeBeverage;
    }

    public String getDescription() {
        return coffeeBeverage.getDescription() + ", Whip";
    }

    public double cost() {
        return coffeeBeverage.cost() + 0.10;
    }
}
