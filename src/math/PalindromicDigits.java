package math;

public class PalindromicDigits {

    public static void main(String[] args){
        System.out.println(palindromicDigits(12321)); // true
        System.out.println(palindromicDigits(5393)); // false
    }

    // Runtime: O(logN) where N is the num we’re given.
    // Space complexity: O(1) or constant
    public static boolean palindromicDigits(int num) {
        int reversed = 0;
        while(reversed < num) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }

        return num == reversed || num == reversed / 10;
    }
}
