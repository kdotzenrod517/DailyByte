package Lists;

public class NonDecreasingOneElement {

    public static void main(String[] args) {
        System.out.println(upUpAndAway(new int[]{3, 1, 2})); // return true (you could modify three to one).
        System.out.println(upUpAndAway(new int[]{4, 2, 1, 3})); // false
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static boolean upUpAndAway(int[] nums){
        int count = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] < nums[i - 1]){
                count++;
                if(count > 1){
                    return false;
                // we should check if we can look two elements back
                // from where we are and if that element is less
                // than or equal to our current element. If it is,
                // we should modify the previous element to be our
                // current element. This check ensures that by doing
                // this reassignment, our array is still non-decreasing
                // within the last three elements
                } else if (i - 2 < 0 || nums[i - 2] <= nums[i]){
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }

        return true;
    }
}
