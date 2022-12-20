package matrix;

public class SumDiagonals {

    public static void main(String[] args) {
        System.out.println(sumDiags(new int[][]{
                {1, 2},
                {2, 1},
        })); // return 6 (1 + 1 + 2 + 2)
        System.out.println(sumDiags(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        })); // return 25 (5 is only added to the sum once).
    }

    // Runtime: O(N) where N is the total number of elements in matrix.
    // Space complexity: O(1) or constant.
    public static int sumDiags(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
            sum += matrix[matrix.length - 1 - i][i];
        }
        return matrix.length % 2 == 0 ?
                sum :
                sum - matrix[matrix.length / 2][matrix.length / 2];
    }
}
