package Lists;

public class RemoveValueInPlace {

    public static void main(String[] args){
        System.out.println(removeValue(new int[]{1, 2, 3}, 2)); // return 2 (after your modifications your array could look like [1, 3, 3]).
    }

    // Runtime: O(N) where N is the total number elements in nums.
    // Space complexity: O(1) or constant.
    private static int removeValue(int[] nums, int val) {
        int index = 0;

        for(int i : nums){
            if(i != val){
                nums[index++] = i;
            }
        }

        return index;
    }
}
