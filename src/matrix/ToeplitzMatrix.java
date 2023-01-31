package matrix;

public class ToeplitzMatrix {

    public static void main(String[] args) {
        System.out.println(isToeplitz(new int[][] {
                {1, 2, 3},
                {4, 1, 2},
                {5, 4, 1}
        })); // return true ([4, 4], [1, 1, 1], and [2, 2]
        // are the diagonals and each diagonal has the same element).
        System.out.println(isToeplitz(new int[][] {
                {1, 2},
                {3, 4}
        })); // return false
    }

    // Runtime: O(N) where N is the total number of elements in matrix.
    // Space complexity: O(1) or constant.
    public static boolean isToeplitz(int[][] matrix){
        for(int i = 0; i < matrix.length - 1; i++){
            for(int j = 0; j < matrix[i].length - 1; j++){
                if(matrix[i][j] != matrix[i + 1][j + 1]){
                    return false;
                }
            }
        }
        return true;
    }
}
