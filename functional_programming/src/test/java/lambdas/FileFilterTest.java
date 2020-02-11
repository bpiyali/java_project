package lambdas;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileFilterTest {
    Set<String> superCycleSet = new TreeSet<>();
    List<String> myStoreList = new ArrayList<>();

    public FileFilterTest() {
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
        FileFilterTest storeInventory = new FileFilterTest();
        storeInventory.printStoreInventory();
        storeInventory.collectCycleItems();
    }
}


