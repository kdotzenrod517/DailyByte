package Lists;

import java.util.Arrays;

public class DuplicateZeros {

    static int[] nums1 = new int[]{1, 0, 4, 0, 5, 8}; // [1,0,0,4,0,0]
    static int[] nums2 = new int[]{1, 4, 9}; // [1, 4, 9]

    public static void main(String[] args){
        addZeros(nums1);
        addZeros(nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static void addZeros(int[] nums){
        int zeroCount = 0;
        for (int i: nums) {
            if (i == 0) {
                zeroCount++;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            int index = i + zeroCount;
            if (index < nums.length) {
                nums[index] = nums[i];
            }
            if (nums[i] == 0) {
                zeroCount--;
                index = i + zeroCount;
                if (index < nums.length) {
                    nums[index] = nums[i];
                }
            }
        }
    }
}
