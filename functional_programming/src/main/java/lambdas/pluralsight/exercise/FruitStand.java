package lambdas.pluralsight.exercise;

import java.util.Map;
import java.util.TreeMap;

/**
 * We have a FruitStand class with a Map called prices, which maps different fruits to their price. We want to edit printPrices() to print out the keys and values in the Map using a specific format.
 *
 * Call forEach() on prices and pass in a Lambda that will print each key, value pair on a separate line with the following format:
 * Fruit: Apple, $1
 *
 * (Hint: The Lambda will need 2 parameters in parentheses before the arrow, e.g., (key, value) -> ...)
 */

public class FruitStand {
    private Map<String, Integer> prices = new TreeMap<>();

    public FruitStand(){
        prices.put("Apple", 1);
        prices.put("Avocado", 2);
        prices.put("Banana", 1);
        prices.put("Mango", 2);
        prices.put("Starfruit", 4);
    }

    public void printPrices() {
        prices.forEach((key, value) -> System.out.println("Fruit: "+ key+", $"+value));
    }

    public static void main(String[] args) {
        FruitStand fruitStand = new FruitStand();
        fruitStand.printPrices();
    }
}
