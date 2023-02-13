package math;

public class SingleDollar {

    public static void main(String[] args) {
        System.out.println(singleDollar(new int[]{1, -4, 2, -3})); // 5 (5 + 1 - 4 + 2 - 3 = 1).
        System.out.println(singleDollar(new int[]{-10})); // 11
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int singleDollar(int[] nums){
        int sum = 0;
        int min = 0;
        for(int i : nums){
            sum += i;
            min = Math.min(sum, min);
        }
        return min == 0 ? 1 : -min + 1;
    }
    //  If our min is zero, then we need one dollar to start with
    //  otherwise, if our min is not zero, then we need the opposite
    //  of our min plus one to ensure we always have at least a single dollar.
}
