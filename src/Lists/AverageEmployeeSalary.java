package Lists;

public class AverageEmployeeSalary {

    public static void main(String[] args) {
        System.out.println(averageEmployeeSalary(new int[]{5000, 2000, 3000, 4000})); // return 3500.00000 ((3000 + 4000) / 2).
    }

    // Runtime: O(N) where N is the total number of elements in salaries.
    // Space complexity: O(1) or constant.
    public static double averageEmployeeSalary(int[] nums){
        int sum = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int n : nums){
            sum += n;
            smallest = Math.min(smallest, n);
            largest = Math.max(largest, n);
        }

        return (sum - largest - smallest) / (nums.length - 2);
    }
}
