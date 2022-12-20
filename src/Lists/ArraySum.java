package Lists;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySum(new int[] {1, 2, 3}))); // [1, 3, 6]
        System.out.println(Arrays.toString(arraySum(new int[] {10}))); // [10]
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] arraySum(int[] nums){
        int sum = nums[0];

        for(int i = 1; i < nums.length; i++){
            nums[i] = sum + nums[i];
            sum = nums[i];
        }

        return nums;
    }
}
