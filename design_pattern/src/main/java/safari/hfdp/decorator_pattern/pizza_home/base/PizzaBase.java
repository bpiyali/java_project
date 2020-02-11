package safari.hfdp.decorator_pattern.pizza_home.base;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;

public abstract class PizzaBase {
    public enum Size {LARGE, MEDIUM, SMALL}

    CoffeeBeverage.Size size = CoffeeBeverage.Size.MEDIUM;
    String description = "Unknown Beverage";

    public CoffeeBeverage.Size getSize() {
        return size;
    }

    public void setSize(CoffeeBeverage.Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
