package matrix;

public class NegativeCount {

    public static void main(String[] args) {
        System.out.println(negativeCount(new int[][]{
                {3, -1},
                {2, -2}
        })); // return 2 (-1 and -2 are negative).
        System.out.println(negativeCount(new int[][]{
                {4, 3},
                {2, 1}
        })); // return 0
    }

    public static int negativeCount(int[][] matrix){
        int row = matrix.length - 1;
        int col = 0;
        int negatives = 0;
        while(row >= 0 && col < matrix[0].length){
            if(matrix[row][col] < 0){
                row--;
                // increment our negatives count by the
                // total number of elements that are remaining in the row
                negatives += matrix[0].length - col;
            } else {
                col++;
            }
        }


        return negatives;
    }
}
