package math;

public class SplitArraySum {

    public static void main(String[] args) {
        System.out.println(splitArraySum(new int[]{2, 3, 9, 9, 3, 2, 3, 2, 9})); // true
        System.out.println(splitArraySum(new int[]{1, 2, 3})); // false
    }

    // Runtime: O(N) where N is the total number of elements in nums.
    // Space complexity: O(1) or constant.
    public static boolean splitArraySum(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        if(sum % 3 != 0) return false;

        int currentSum = 0;
        int average = sum / 3;
        int partitions = 0;

        for(int num : nums){
            currentSum += num;
            if(currentSum == average){
                partitions++;
                currentSum = 0;
            }
        }


        return partitions >= 3;
    }
}
