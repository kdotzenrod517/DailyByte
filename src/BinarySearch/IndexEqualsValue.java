package BinarySearch;

public class IndexEqualsValue {

    public static void main(String[] args) {
        System.out.println(indexEqualsValue(new int[]{0, 4, 8})); // return 0 (zero occurs at the 0th index).
        System.out.println(indexEqualsValue(new int[]{1, 3, 7, 12})); // return -1
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int indexEqualsValue(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == i) {
                return nums[i];
            } else if(nums[i] > i){
                return -1;
            }
        }
        return -1;
    }
}
