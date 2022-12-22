package math;

public class EvenDigitIntegers {

    public static void main(String[] args) {
        System.out.println(evenDigitIntegers(new int[] {1, 12, 123})); // 1
        System.out.println(evenDigitIntegers(new int[] {1, 32, 3492, 23})); // 3
    }

    // Runtime: O(N) where N is the total number of digits in all are values within nums.
    // Space complexity: O(1) or constant.
    public static int evenDigitIntegers(int[] nums) {
        int totalEven = 0;
        for (int num: nums) {
            int digitCount = 0;
            while (num > 0) {
                num /= 10;
                digitCount++;
            }

            if (digitCount % 2  == 0) {
                totalEven++;
            }
        }

        return totalEven;
    }
}
