package safari.hfdp.shopping;

public class Shop {
  public static void main(String[] args) {
    ClothingPair<Sock> ps = new ClothingPair<>(
        new Sock(9, "Red"), new Sock(10, "Red"));

    System.out.println("The Pair is " + ps);
    boolean matched = ps.matches();
    System.out.println("matches? " + matched);

    ClothingPair<Sock> ps2 = new ClothingPair<>(
        new Sock(10, "Red"), new Sock(10, "Green"));
    System.out.println("ps2 matches? " + ps2.matches());

    Sock left = new Sock(8, "Blue");
    Sock right = new Sock(9, "Blue");

    System.out.println("proposal is good? " + ClothingPair.matched(left, right));
  }
}
