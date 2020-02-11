package safari.hfdp.decorator_pattern.star_buzz.decorator;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public abstract class CondimentsDecorator extends CoffeeBeverage {
    //public CoffeeBeverage coffeeBeverage;
    public abstract String getDescription();

    /*@Override
    public Size getSize() {
        return coffeeBeverage.getSize();
    }*/
}
