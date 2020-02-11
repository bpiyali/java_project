package safari.hfdp.decorator_pattern.star_buzz.decorator;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public class Soy extends CondimentsDecorator {
    CoffeeBeverage coffeeBeverage;

    public Soy(CoffeeBeverage coffeeBeverage) {
        this.coffeeBeverage = coffeeBeverage;
    }

    public String getDescription() {
        return coffeeBeverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = coffeeBeverage.cost();
        switch (coffeeBeverage.getSize()) {
            case LARGE:
                cost += 0.15;
                break;
            case MEDIUM:
                cost += 0.12;
                break;
            default:
                cost += 0.10;
                break;
        }
        return cost;
    }
}
