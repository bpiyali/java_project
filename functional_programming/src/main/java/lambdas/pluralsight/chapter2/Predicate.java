package lambdas.pluralsight.chapter2;

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);

    static <T> Predicate<T> isEqualsTo(T str) {
        return t -> t.equals(str);
    }


    default Predicate<T> and(Predicate<T> get5){
        return t-> test(t) && get5.test(t);
    }

    default Predicate<T> or(Predicate<T> get5){
        return t-> test(t) || get5.test(t);
    }
}
