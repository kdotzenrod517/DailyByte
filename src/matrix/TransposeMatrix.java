package matrix;

import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(transpose(new int[][]{
                {1, 2},
                {3, 4}
        }))); // [[1,3],
             //  [2,4]]
        }

        // Runtime: O(N) where N is the total number of elements in our matrix nums.
        // Space complexity: O(N) where N is the total number of elements in our matrix nums.
        // This results from creating a matrix of size N to hold our transposed matrix.
    public static int[][] transpose(int[][] nums) {
        int[][] transpose = new int[nums[0].length][nums.length];
        for(int j = 0; j < nums[0].length; j++){
            for(int i = 0; i < nums.length; i++){
                transpose[j][i] = nums[i][j];
            }
        }

        return transpose;
    }
}
