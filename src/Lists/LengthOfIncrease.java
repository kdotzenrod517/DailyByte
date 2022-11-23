package Lists;

public class LengthOfIncrease {

    public static void main(String[] args){
        System.out.println(lengthOfIncrease(new int[]{1, 2, 3})); // 3
        System.out.println(lengthOfIncrease(new int[]{3, 4, 1, 2, 8})); // 3
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int lengthOfIncrease(int[] nums){
        int start = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i - 1] >= nums[i]){
                start = i;
            }
            count = Math.max(count, i - start + 1);
        }

        return count;
    }
}
