package basic_algo;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumber {
//    private boolean checkPrime(int num){
////        boolean flag = false;
////        if(num <1)
////            return false;
////
////        for(int i=0; i<i/2; i++){
////            flag= num%i != 0 ? false: true;
////        }
////        return IntStream.range(2, num/2).noneMatch(i -> num % i == 0);
////        return flag;
////
////
////    }

    private static boolean isPrime(int number) {
        return number > 1 && IntStream
                .range(2, number/2)
                .noneMatch(i -> number % i == 0);
    }

    public static void main(String[] args) {
        System.out.println("15 is prime "+ isPrime(15));
    }
}
