package math;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6)); // true (1 + 2 + 3 = 6).
        System.out.println(isPerfectNumber(7)); // false
    }

    // Runtime: O(sqrt(N)) where N is the num we’re given.
    // Space complexity: O(1) or constant
    public static boolean isPerfectNumber(int num) {
        if (num < 2) {
            return false;
        }

        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }

        return sum == num;
    }
}
