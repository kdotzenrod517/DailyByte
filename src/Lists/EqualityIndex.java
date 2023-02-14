package Lists;

public class EqualityIndex {

    public static void main(String[] args) {
        System.out.println(equalityIndex(new int[]{1, 2, 5, 2, 1})); // return 2 (1 + 2 = 2 + 1)
        System.out.println(equalityIndex(new int[]{3, 1, 9, 2})); // return -1
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int equalityIndex(int[] nums){
        int left = 0;
        int right = 0;

        for(int i : nums){
            right += i;
        }

        for(int i = 0; i < nums.length; i++){
            right -= nums[i];
            if(left == right)
                return i;
            left += nums[i];
        }

        return -1;
    }
}
