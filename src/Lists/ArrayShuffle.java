package Lists;

import java.util.Arrays;

public class ArrayShuffle {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeElements(new int[]{1, 2, 3, 4}))); //  [2,1,4,3]
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    // This results from creating our new array which will contain all N elements sorted.
    public static int[] rearrangeElements(int[] nums) {
        int[] sorted = new int[nums.length];
        int evenIndex = 0;
        int oddIndex = 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                sorted[evenIndex] = num;
                evenIndex += 2;
            } else if (num % 2 == 1) {
                sorted[oddIndex] = num;
                oddIndex += 2;
            }
        }

        return sorted;
    }
}
