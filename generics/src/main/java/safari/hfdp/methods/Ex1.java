package safari.hfdp.methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Criterion<E> {
  boolean test(E e);
}

public class Ex1 {
  public static <E> List<E> filter(List<E> in, Criterion<? super E> crit) {
    List<E> out = new ArrayList<>();
    for (E e : in) {
      if (crit.test(e)) {
        out.add(e);
      }
    }
    return out;
  }

  public static void main(String[] args) {
    List<String> ls = Arrays.asList("Fred", "Jim", "Sheila");
    ls.forEach(s -> System.out.println("> " + s));

    Criterion<CharSequence> testCharSequence = s -> s.length() > 3;
    filter(ls, testCharSequence).forEach(s -> System.out.println(">> " + s));

    List<StringBuilder> lsb = Arrays.asList(new StringBuilder("FRED"), new StringBuilder("JIM"), new StringBuilder("SHEILA"));
    filter(lsb, testCharSequence).forEach(s -> System.out.println(">> " + s));

    Criterion<Object> testObj = o -> o == "Fred";
    filter(ls, testObj).forEach(s -> System.out.println("-- " + s));
  }
}
