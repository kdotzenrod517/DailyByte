package math;

public class SubArraySum {

    public static void main(String[] args) {
        // return 12 ([1], [2], [3], [1, 2, 3] sum to 12).
        System.out.println(subarraySum(new int[]{1, 2, 3}));
        System.out.println(subarraySum(new int[]{3, 1, 5, 2, 4})); // 58
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    private static int subarraySum(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += ((i + 1) * (nums.length - i) + 1) / 2 * nums[i];
        }
        return sum;
    }
}
