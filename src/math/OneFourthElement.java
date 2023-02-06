package math;

public class OneFourthElement {

    public static void main(String[] args) {
        System.out.println(oneFourth(new int[]{1, 2, 2, 3, 4})); // 2
        System.out.println(oneFourth(new int[]{1, 2, 3, 4})); // -1
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int oneFourth(int[] nums) {
        int fourth = nums.length / 4;
        for (int i = 0; i < nums.length - fourth; i++) {
            if (nums[i] == nums[i + fourth]) {
                return nums[i];
            }
        }

        return -1;
    }

}
