package Lists;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args){
        System.out.println(Arrays.toString(rearrangeElements(new int[]{3, 7, 0, 5, 0, 2}))); // 3,7,5,2,0,0
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int[] rearrangeElements(int[] nums){

        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for(int i = index; i < nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }
}
