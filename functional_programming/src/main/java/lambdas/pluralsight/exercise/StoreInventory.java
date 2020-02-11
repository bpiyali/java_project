package lambdas.pluralsight.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * We have a List of store items called myStoreList. We want to print out all of the items in our List using a specific format.
 *
 * In printStoreInventory(), print all of the items in myStoreList using the forEach() method with a Lambda Expression. Each item should be printed on a separate line using System.out.println() with the string "My Store item: " concatenated with the item's value.
 *
 *
 * We want to populate the Set superCycleSet with the cycle items from our other store List. To do that, we'll check for items that contain the String "cycle" and then add them into superCycleSet.
 *
 * In collectCycleItems(), call myStoreList.forEach() and pass in a Lambda expression that checks if each item contains the String "cycle", and if it does then add that item to superCycleSet with add().
 *
 * (Hint: You will need a multi-line Lambda using curly brackets {}. The if statement and add() statement will be on separate lines.)
 */
public class StoreInventory {
    Set<String> superCycleSet = new TreeSet<>();
    List<String> myStoreList = new ArrayList<>();

    public StoreInventory() {
        myStoreList.add("Bicycle");
        myStoreList.add("Tricycle");
        myStoreList.add("Scooter");
    }

    public void printStoreInventory() {
        myStoreList.forEach(myList ->System.out.println("My Store item: " + myList));
    }

    public void collectCycleItems() {
        myStoreList.forEach(i -> {
            if(i.contains("cycle"))
                superCycleSet.add(i);
        });
        superCycleSet.forEach(myList ->System.out.println("Super Cycle item: " + myList));
    }

    public static void main(String[] args) {
        StoreInventory storeInventory = new StoreInventory();
        storeInventory.printStoreInventory();
        storeInventory.collectCycleItems();
    }
}
