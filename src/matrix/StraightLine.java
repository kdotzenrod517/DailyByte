package matrix;

public class StraightLine {

    public static void main(String[] args) {
        System.out.println(isBoomerang(new int[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        })); // false
        System.out.println(isBoomerang(new int[][]{
                {1, 2},
                {4, 4},
                {2, 3}
        })); // true
    }

    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public static boolean isBoomerang(int[][] points) {
        return (points[0][0] - points[1][0]) * (points[0][1] - points[2][1]) != (points[0][0] - points[2][0]) * (points[0][1] - points[1][1]);
    }
}
