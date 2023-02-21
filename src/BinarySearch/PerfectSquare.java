package BinarySearch;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(perfectSquare(9)); // true
        System.out.println(perfectSquare(18)); // false
    }

    // Runtime: O(logN) where N is the num we’re given.
    // Space complexity: O(1) or constant.
    public static Boolean perfectSquare(int num){
        int left = 1;
        int right = num;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(mid * mid == num){
                return true;
            } else if (mid * mid < num){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
