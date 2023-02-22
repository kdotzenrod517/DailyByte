package matrix;

public class SameLine {

    public static void main(String[] args) {
        System.out.println(sameLine(new int[][]{
                {1, 2},
                {3, 2}
        })); // true
        System.out.println(sameLine(new int[][]{
                {1, 2},
                {3, 2},
                {-1, -1}
        })); // false
    }

    // Runtime: O(N) where N is the total number of elements in points.
    // Space complexity: O(1) or constant.
    public static boolean sameLine(int[][] points) {
        if(points.length == 2) {
            return true;
        }

        int[] p1 = points[0];
        int[] p2 = points[1];
        for(int i = 2; i < points.length; i++) {
            int[] current = points[i];
            if((current[0] - p1[0]) * (p2[1] - p1[1]) != (current[1] - p1[1]) * (p2[0] - p1[0])) {
                return false;
            }
        }

        return true;
    }
}
