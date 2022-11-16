package math;

public class OverlappingTriangles {

    // Runtime: O(1) or constant.
    // Space complexity: O(1) or constant.
    public static void main(String[] args){
        System.out.println(isOverlapping(new int[]{0, 0, 1, 1}, new int[]{0, 0, 3, 3})); // true
        System.out.println(isOverlapping(new int[]{0, 0, 1, 1}, new int[]{1, 1, 4, 4})); // false
    }

    public static boolean isOverlapping(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }
}
