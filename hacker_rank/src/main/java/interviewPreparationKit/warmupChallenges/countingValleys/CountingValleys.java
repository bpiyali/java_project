package interviewPreparationKit.warmupChallenges.countingValleys;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    // Complete the countingValleys function below.
    private static int countingValleys(int n, String s) {
        int vallyCount = 1;
        int len = s.length();
        for(int i=0; i<len;i++){
            if(s.charAt(i) == 'U'){
                ++vallyCount;
            }else if(s.charAt(i) == 'D'){
                --vallyCount;
            }
        }
        return vallyCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = "DDUUDDUDUUUD";

        int result = countingValleys(12, s);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        //scanner.close();
        System.out.println(result);
    }
}
