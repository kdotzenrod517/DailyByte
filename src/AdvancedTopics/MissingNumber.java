package AdvancedTopics;

public class MissingNumber {

    // Given an array that contains all distinct values from zero through N except one number,
    // return the number that is missing from the array.
    public static void main(String[] args){
        System.out.println(missingNumber(new int[]{1, 4, 2, 0})); // 3, 3 is the only number missing in the array between 0 and 4.
        System.out.println(missingNumber(new int[]{6, 3, 1, 2, 0, 5})); // 4, 4 is the only number missing in the array between 0 and 6.
    }

    // Use Gauss’ formula
    // Runtime: O(N) where N is the total number of elements in nums.
    // This results from having to iterate through all numbers in nums in order to determine our actual sum.
    // Space complexity: O(1) or constant.
    public static int missingNumber(int[] nums) {
        int sum = 0;
        for(int i: nums) {
            sum += i;
        }

        int n = nums.length;
        return (n * (n + 1) / 2) - sum;
    }
}
