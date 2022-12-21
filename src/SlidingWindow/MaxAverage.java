package SlidingWindow;

public class MaxAverage {

    public static void main(String[] args) {
        System.out.println(maxAverage(new int[]{4, -1, 4, 2}, 2)); //  return 3.0 ((4 + 2) / 2 = 3.0).
        System.out.println(maxAverage(new int[]{5, 1, -3, 5, 2}, 3)); // 1.33
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static double maxAverage(int[] nums, int k){
        double windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }

        double maxSum = windowSum;
        for(int i = k; i < nums.length; i++){
            // removing the first element in our window (leftmost) and
            // adding the current value we’re on.
            // This can be done by adding to our sum the
            // difference between these two elements.
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }

        return maxSum / k;
    }
}
