package Lists;

public class ConsecutiveOddValues {


    public static void main(String[] args) {
        System.out.println(threeInARow(new int[]{1, 2, 3, 4, 5})); // false
        System.out.println(threeInARow(new int[]{1, 3, 4, 2, 3, 9, 15})); // true
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static boolean threeInARow(int[] nums){
        int count = 0;

        for(int i : nums){
            count = i % 2 == 1 ? count + 1 : 0;
            if(count == 3)
                return true;
        }

        return false;
    }
}
