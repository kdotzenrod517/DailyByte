package math;

import java.util.Arrays;

public class nElementsSumToZero {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumToZero(1))); // [0] (1 number that sums to zero is 0 itself).
        System.out.println(Arrays.toString(sumToZero(2))); // [-1, 1] (this is one possible solution).
    }

    // Runtime: O(N) where N is the value we’re given.
    // Space complexity: O(N) where N is the value we’re given.
    public static int[] sumToZero(int N) {
        int[] nums = new int[N];
        for(int i = 0; i < N; i++){
            nums[i] = i * 2 - N + 1;
        }
        return nums;
    }
}
