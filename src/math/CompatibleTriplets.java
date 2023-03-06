package math;

public class CompatibleTriplets {

    // Given an array of integers, nums, and three additional integers,
    // a, b, and c, return the total number of compatible triplets.
    // Note: Three integers are said to be a compatible triplet if they are
    // three individual numbers in nums and |nums[i] - nums[j]| <= a, |nums[j] - nums[k]| <= b, and |nums[i] - nums[k]| <= c.
    public static void main(String[] args) {
        System.out.println(compatibleTriplets(new int[]{1, 2, 3}, 3, 2, 5)); // 1
    }

    // Runtime: O(N3) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int compatibleTriplets(int[] nums, int a, int b, int c) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (Math.abs(nums[i] - nums[j]) > a) {
                    continue;
                }
                for (int k = j + 1; k < nums.length; k++) {
                    if(Math.abs(nums[j] - nums[k]) <= b && Math.abs(nums[k] - nums[i]) <= c) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
