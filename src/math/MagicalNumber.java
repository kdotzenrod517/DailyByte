package math;

public class MagicalNumber {

    //  A magical numbers is a number in which the the sum of all its digits raised to the kth power sum to the number itself.
    public static void main(String[] args) {
        System.out.println(magicalNumber(153)); // true (1^3 + 5^3 + 3^3 = 153).
        System.out.println(magicalNumber(38)); // false
    }

    // Runtime: O(logN) where N is the num we’re given.
    // Space complexity: O(1) or constant.
    public static boolean magicalNumber(int num) {
        int numDigits = (int) (Math.log10(num) + 1);
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        return sum == num;
    }
}
