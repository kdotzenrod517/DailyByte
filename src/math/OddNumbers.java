package math;

public class OddNumbers {

    // Given two non-negative integers low and high, return the total count of odd numbers between them (inclusive).
    public static void main(String[] args) {
        System.out.println(oddNumbers(1, 3)); // 2 (1 and 3 are both odd)
        System.out.println(oddNumbers(1, 10)); // 5
    }

    // O(n)
    public static int oddNumbers(int lo, int high){
        int sum = 0;
        for(int i = lo; i <= high; i++){
            if(i % 2 != 0){
                sum++;
            }
        }
        return sum;
    }










    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public int oddNumbersConstant(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
