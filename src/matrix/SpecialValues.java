package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpecialValues {

    // Given an N x M matrix, containing distinct elements,
    // return all special values.
    // Note: A special value in the matrix is an element that is
    // the minimum element in the its row and the maximum element in its column.
    public static void main(String[] args){
        System.out.println(specialValues(new int[][]{
                {1, 2},
                {3, 4}
        })); // [3]
        System.out.println(specialValues(new int[][]{
                {1, 2, 5},
                {4, 8, 3},
                {9, 7, 6}
        })); // [6]
    }

    // Runtime: O(N) where N is the total number of elements in matrix.
    // Space complexity: O(N + M) where N is the total number of rows within matrix and M is the total number of columns in matrix.
    public static List<Integer> specialValues(int[][] matrix){
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        List<Integer> special = new ArrayList<>();
        Arrays.fill(rows, Integer.MAX_VALUE);

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                rows[i] = Math.min(rows[i], matrix[i][j]);
                cols[j] = Math.max(cols[j], matrix[i][j]);
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(rows[i] == cols[j]){
                    special.add(rows[i]);
                }
            }
        }

        return special;
    }
}
