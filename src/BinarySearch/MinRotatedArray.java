package BinarySearch;

public class MinRotatedArray {


    public static void main(String[] args){
        System.out.println(minRotatedArray(new int[]{7, 9, 10, 2, 4, 6})); // 2
    }

    // Runtime: O(logN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int minRotatedArray(int[] nums){
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.min(nums[0], nums[1]);
        }

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if(nums[mid] >= nums[left] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return nums[left];
    }
}
