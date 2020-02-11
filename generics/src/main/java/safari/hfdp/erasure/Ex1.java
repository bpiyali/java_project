package safari.hfdp.erasure;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Ex1 {
  public static <E> E[] getAsArray(List<E> in, Class<? super E> cl) {
    E[] res = (E[])Array.newInstance(cl, in.size());
    for (int i = 0; i < res.length; i++) {
      res[i] = in.get(i);
    }
    return res;
  }

//  public static String[] getAsArray(List<String> in) {
//    String[] res = new String[in.size()];
//    for (int i = 0; i < res.length; i++) {
//      res[i] = in.get(i);
//    }
//    return res;
//  }
  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    System.out.println("type of ls is " + ls.getClass().getName());

//    for (Object o : getAsArray(ls)) {
//      System.out.println(">>>" + o);
//    }

    CharSequence[] asArray = getAsArray(ls, CharSequence.class);
    System.out.println("asArray: " + asArray);
    for (CharSequence s : asArray) {
      System.out.println("> " + s);
    }
  }
}
