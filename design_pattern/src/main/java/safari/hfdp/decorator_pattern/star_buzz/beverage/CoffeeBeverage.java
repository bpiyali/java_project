package safari.hfdp.decorator_pattern.star_buzz.beverage;

public abstract class CoffeeBeverage {
    public enum Size {LARGE, MEDIUM, SMALL}

    Size size = Size.MEDIUM;
    String description = "Unknown Beverage";

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
