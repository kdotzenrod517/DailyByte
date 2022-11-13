package math;

public class SquareRoot {

    public static void main(String[] args){
        System.out.println(squareRoot(9)); // 3
        System.out.println(squareRoot(12)); // 3
    }

    // Runtime: O(logx).
    // Space complexity: O(1) or constant.
    public static int squareRoot(int x) {
        if(x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid > x / mid) {
                right = mid - 1;
            } else {
                if((mid + 1) > x / (mid + 1)) {
                    return mid;
                }
                left = mid + 1;
            }
        }

        return left;
    }
}
