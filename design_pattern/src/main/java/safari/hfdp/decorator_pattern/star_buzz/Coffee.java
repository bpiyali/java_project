package safari.hfdp.decorator_pattern.star_buzz;

import safari.hfdp.decorator_pattern.star_buzz.beverage.CoffeeBeverage;
import safari.hfdp.decorator_pattern.star_buzz.beverage.Espresso;
import safari.hfdp.decorator_pattern.star_buzz.beverage.HouseBlend;
import safari.hfdp.decorator_pattern.star_buzz.decorator.Mocha;
import safari.hfdp.decorator_pattern.star_buzz.decorator.Soy;
import safari.hfdp.decorator_pattern.star_buzz.decorator.Whip;

public class Coffee {
    public static void main(String[] args) {
        CoffeeBeverage espresso = new Espresso();

        System.out.println(espresso.getDescription() + ": $"+ espresso.cost());

        CoffeeBeverage customHouseBlend = new HouseBlend();

        customHouseBlend = new Mocha(customHouseBlend);
        customHouseBlend = new Mocha(customHouseBlend);
        customHouseBlend.setSize(CoffeeBeverage.Size.LARGE);
        customHouseBlend = new Soy(customHouseBlend);
        customHouseBlend = new Whip(customHouseBlend);

        System.out.println(customHouseBlend.getDescription() + ": $"+ customHouseBlend.cost());
    }
}
