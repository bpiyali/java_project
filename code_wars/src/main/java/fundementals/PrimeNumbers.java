package fundementals;

import java.util.stream.IntStream;

public class PrimeNumbers {
    private static boolean isPrime(int number) {
        return number > 1 && IntStream
                .range(2, number/2)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        System.out.println("15 is prime "+ isPrime(15));
    }

}
