package math;

public class ProductAndSumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitArithmetic(321)); //  0 ((3 * 2 * 1) - (3 + 2 + 1).
        System.out.println(digitArithmetic(56)); //  19
    }

    // Runtime: O(logN).
    // Space complexity: O(1) or constant.
    public static int digitArithmetic(int n) {
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        return product - sum;
    }
}
