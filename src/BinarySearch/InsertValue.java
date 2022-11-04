package BinarySearch;

public class InsertValue {

    public static void main(String[] args){
        System.out.println(insertValue(new int[]{1, 5, 8, 12}, 12)); // 3
        System.out.println(insertValue(new int[]{3, 4, 7, 12, 29}, 5)); // 2
    }

    // Runtime: O(logN) where N is the number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int insertValue(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
         }


        return left;
    }
}
