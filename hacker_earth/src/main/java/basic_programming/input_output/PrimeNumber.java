package basic_programming.input_output;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * You are given an integer N. You need to print the series of all prime numbers till N.
 * <p>
 * Input Format
 * <p>
 * The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.
 * <p>
 * Output Format
 * <p>
 * Print the desired output in single line separated by spaces.
 * <p>
 * Constraints
 * <p>
 * 1<=N<=1000
 * <p>
 * Input: 9
 * Output: 2 3 5 7
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        //primeNumbers(number).forEach(System.out::println);
        primeNumbers(number).forEach(i -> System.out.print(i +" "));
    }

    private static List<Integer> primeNumbers(int n) {
        return IntStream
                .range(2, n)
                .filter(x -> isPrime(x))
                .boxed()
                .collect(Collectors.toList());
    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
