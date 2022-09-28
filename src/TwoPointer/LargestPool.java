package TwoPointer;

public class LargestPool {

    public static void main(String[] args){
        // You can build your largest pool (most water) between indices 1 and 3 (inclusive) for a water volume of 4 * 2 = 8.
        System.out.println(largestPool(new int[]{1, 4, 4, 8, 2})); // 8
    }

    // Runtime: O(N) where N is the total number of elements in heights.
    // Space complexity: O(1) or constant.
    public static int largestPool(int[] heights){
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;

        while(left < right) {
            int min = Math.min(heights[left], heights[right]);
            max = Math.max(max, min * (right - left));
            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
