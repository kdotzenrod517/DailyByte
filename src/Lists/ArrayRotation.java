package Lists;

public class ArrayRotation {

    public static void main(String[] args) {
        System.out.println(arrayRotation(new int[]{4, 5, 1, 2, 3})); // return true (values 4 and 5 were rotated to the beginning of the array).
        System.out.println(arrayRotation(new int[]{4, 5, 1, 2, 3, 6})); // false
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static boolean arrayRotation(int[] nums){
        int count = 0;

       for(int i = 0; i < nums.length; i++){
           if(nums[i] > nums[(i + 1) % nums.length]){
               count++;
           }
           if(count > 1){
               return false;
           }
       }
        return true;
    }
}
