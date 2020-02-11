package safari.hfdp.shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Fred", "Jones");

    String left = p.getLeft();
    p.setRight("Jonesey");
  }
}
