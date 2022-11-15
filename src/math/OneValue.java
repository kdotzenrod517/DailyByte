package math;

public class OneValue {

    public static void main(String[] args){
        System.out.println(oneValue(new int[] {1, 2, 2, 2, 3, 3, 3})); // 1
        System.out.println(oneValue(new int[] {3, 3, 2, 5, 2, 2, 5, 3, 9, 5})); //9
    }

    // Runtime: O(N) where N is the total number of values in nums.
    // Space complexity: O(1) or constant.
    public static int oneValue(int[] nums) {
        int once = 0;
        int twice = 0;
        for (int num: nums) {
            once = ~twice & (once ^ num);
            twice = ~once & (twice ^ num);
        }

        return once;
    }
}
