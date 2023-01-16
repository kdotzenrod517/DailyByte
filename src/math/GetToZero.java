package math;

public class GetToZero {

    // If num is even, divide it by two.
    // If num is odd, subtract one from it.
    // Continue this process until num is zero.
    public static void main(String[] args) {
        System.out.println(getToZero(5)); // return 4 (subtract 1, divide by 2, divide by 2, subtract 1).
        System.out.println(getToZero(16)); // 5
    }

    // Runtime: O(logN) where N is the num we’re given.
    // Space complexity: O(1) or constant.
    public static int getToZero(int num){
        int operations = 0;

        if (num == 0)
            return operations;

        while(num != 0){
            if(num % 2 == 0){
                num = num / 2;
            } else {
                num = num - 1;
            }
            operations++;
        }

        return operations;
    }
}
