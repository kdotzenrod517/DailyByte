package math;

public class MaxProduct {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{4, 2, 5, 3})); // return 20 (5 * 4)
        System.out.println(maxProduct(new int[]{6, 2, 4, 3})); // 24
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static int maxProduct(int[] nums){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : nums){
            if(num >= first){
                second = first;
                first = num;
            } else if (num > second){
                second = num;
            }
        }
        return first * second;
    }
}
