package Lists;

public class Votes {

    // Uses the Boyer-Moore majority voting algorithm
    public static void main(String[] args){
        System.out.println(findPresident(new int[]{1, 1, 2, 2, 1})); // 1
        System.out.println(findPresident(new int[]{1, 3, 2, 3, 1, 2, 3, 3, 3})); // 3
    }

    // Runtime: O(N) where N is the total number of votes in votes.
    // Space complexity: O(1) or constant.
    public static int findPresident(int[] nums) {
        int candidate = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(count == 0){
                count++;
                candidate = nums[i];
            } else if (candidate == nums[i]){
                count++;
            } else {
                count--;
            }
        }

        return count;
    }
}
