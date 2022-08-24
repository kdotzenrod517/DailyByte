package math;

public class DivisibleDigits {

    public static void main(String[] args){
        System.out.println(selfDividingNumbers(17)); // 12 -- 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15 are all self divisible numbers.
    }

    // Runtime: O(N)
    // Space complexity: O(1)
    public static int selfDividingNumbers(int N) {
        int count = 0;
        for(int i = 1; i < N; i++) {
            if(selfDivisible(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean selfDivisible(int num) {
        int startValue = num;
        while(num > 0) {
            int digit = num % 10;
            if(digit == 0 || startValue % digit != 0) {
                return false;
            }

            num /= 10;
        }

        return true;
    }
}
