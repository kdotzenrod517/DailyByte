package BinarySearch;

public class FindValue {

    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{-5, -3, 0, 3, 8, 12, 40}, 8)); // 4
        System.out.println(binarySearch(new int[]{1, 2, 3, 6, 8}, 10)); // -1 (not found)
    }

    // Runtime: O(logN) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int binarySearch(int[] nums, int target){
        if (nums == null || nums.length == 0) return -1;

        int left =  0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
