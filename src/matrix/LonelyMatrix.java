package matrix;

public class LonelyMatrix {

    public static void main(String[] args) {
        System.out.println(lonelyMatrixCount(new int[][] {
                {1, 0},
                {0, 1}
        })); // 2
        System.out.println(lonelyMatrixCount(new int[][] {
                {1, 0, 1},
                {0, 1, 0},
                {0, 0, 1}
        })); // 1
    }

    // Runtime: O(N) where N is the total number of elements in matrix.
    // Space complexity: O(N + M) where N is the total number of rows within matrix and M is the total number of columns in matrix.
    public static int lonelyMatrixCount(int[][] matrix){
        int lonely = 0;
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1 && rows[i] == 1 && cols[i] == 1){
                   lonely++;
                }
            }
        }

        return lonely;
    }
}
