package BinarySearch;

public class KthMissingNumber {

    // Runtime: O(logN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static void main(String[] args) {
        System.out.println(somethingMissing(new int[]{1, 9, 13, 22}, 4)); // return 5 (5 is the 4th missing number).
        System.out.println(somethingMissing(new int[]{3, 4, 5}, 2)); // 2
    }

    public static int somethingMissing(int[] nums, int k){
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = (l + r) / 2;
            // If the number of elements
            // between nums[mid] and mid
            // is not greater than k
            if(nums[mid] - mid <= k){
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l + k;
    }
}
