package piyali.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // proxy pattern which guarantee that
        names = Collections.checkedList(names, String.class);

        names.add("Piyali");
        names.add("Abhijit");
        names.add("Atreyi");

        addtoList(names);
        //Object first = names.get(0);
        String firstName = names.get(0);
        //String firstName = (String)first;
        for (String str: names)
            System.out.println(str);
    }

    private static void addtoList(List<String> names) {
        //names.add(0, LocalDate.now());
        names.add(0, "Uma");
    }
}
