package matrix;

public class ComputerNetwork {

    public static void main(String[] args) {
        System.out.println(computerNetwork(new int[][] {
                {1, 0},
                {1, 0}
        })); // return 2 (both servers are in the same column and can therefore communicate with one another).
        System.out.println(computerNetwork(new int[][] {
                {1, 0},
                {0, 1}
        })); // 0
    }

    // Runtime: O(N x M) where N is the total number of rows in our matrix and M is the total number of columns in our matrix.
    // Space complexity: O(N + M) where N is the total number of rows in our matrix and M is the total number of columns in our matrix.
    public static int computerNetwork(int[][] matrix){
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }

        int servers = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                //  check if there is another server within the current row
                //  or the current column that the server we’re on can
                //  communicate with (i.e. rows[i] > 1 || cols[j] > 1).
                if(matrix[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)){
                    servers++;
                }
            }
        }

        return servers;
    }
}
