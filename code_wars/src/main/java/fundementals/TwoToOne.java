package fundementals;

import java.util.stream.Stream;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        StringBuilder result = new StringBuilder();
        String newString = s1 + s2;

        for (char c = 'a'; c <= 'z'; c++){
            if (newString.contains(c + ""))
                result.append(c);
        }
        return result.toString();

        //return (s1 + s2).chars().distinct().sorted().forEach(c -> result.append((char) c)).toString();

    }
}
