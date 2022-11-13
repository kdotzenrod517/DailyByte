package Lists;

public class RemoveDuplicates {

    public static void main(String[] args){
        System.out.println(removeDupes(new int[]{1, 2, 2, 4, 4, 6, 8, 8})); // 5
        System.out.println(removeDupes(new int[]{1, 2, 3, 3})); // 3
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int removeDupes(int[] nums){
        int index = 1;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                nums[index++] = nums[i + 1];
            }
        }
        return index;
    }
}
