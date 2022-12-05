package Lists;

import java.util.Arrays;

public class DataSetError {

    public static void main(String[] args){
        System.out.println(Arrays.toString(dataSetError(new int[]{1, 3, 2, 5, 5}))); // 5, 4
        System.out.println(Arrays.toString(dataSetError(new int[]{1, 2, 3, 3}))); // 3, 4
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(N) where N is the total number of elements in nums.
    public static int[] dataSetError(int[] nums){
        int[] count = new int[nums.length + 1];
        int duplicate = -1;
        int missing = 1;
        for (int num : nums) {
            count[num] += 1;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] == 2){
                duplicate = i;
            } else if(count[i] == 0){
                missing = i;
            }
        }

        return new int[] {duplicate, missing};
    }
}
