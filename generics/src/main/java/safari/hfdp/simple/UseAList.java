package safari.hfdp.simple;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseAList {
    public static void addToList(List l) {
      l.add(0, LocalDate.now());
    }

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(
        Arrays.asList(/*LocalDate.now(), */"Albert"));
    names = Collections.checkedList(names, String.class);
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");

//    names.add(LocalDate.now());
//    addToList(names);
//    Object first = names.get(0);
    String first = names.get(0);
//    String firstString = (String)first;
    for (String s : names) {
      System.out.println(s);
    }

    String s = "hello";
    Class clazz = s.getClass();
    System.out.println("Class of s is " + clazz.getName());

    Class class2 = String.class;

    System.out.println("Class of s is String.class " + (class2 == clazz));
  }
}
