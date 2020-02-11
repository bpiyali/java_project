package problem9;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if (x < 10)
            return true;
        int num = 0;
        int digit = x;
        while(digit > 0){
            num = (num * 10)+(digit % 10);
            digit /= 10;
        }

        return num == x;
    }
}
