package daysofCode.day10;

import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        convertBinary(n);
        scanner.close();
    }

    private static void convertBinary(int n){
        int count = 0;
        int maxCount = 0;
        while(n > 0){
            int rem = n % 2;
            n = n/2;
            if(rem == 1){
                count += 1;
            }else{
                maxCount = count > maxCount? count: maxCount;
                count = 0;
            }
        }
        System.out.println(count > maxCount? count: maxCount);
    }
}
