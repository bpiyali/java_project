package safari.hfdp.shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  java.lang.String name = "Fred";

// can list many interfaces, may include a single class constraint
// but if you do, it must be first in the list
// class Blah extends OtherClass implements InterfaceA, InterfaceB
public class ClothingPair<E extends Object & Sized & Colored> extends Pair<E> {
  public ClothingPair(E left, E right) {
    // validate...
    super(left, right);
  }

  public static <E extends Sized & Colored> boolean matched(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public boolean matches() {
//    if (left instanceof Sock) // UGLY (but might be legitimate sometimes)
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }
}
