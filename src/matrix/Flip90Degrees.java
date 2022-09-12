package matrix;

import java.util.Arrays;

public class Flip90Degrees {

    public static void main(String[] args){
        imageFlip(new int[][]{
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
        }); // [16,13,10],
            // [17,14,11],
            // [18,15,12]
    }

    // Runtime: O(N2) where N is the total number of rows in our image.
    // Space complexity: O(1) or constant as we’re modifying the image in place.
    public static void imageFlip(int[][] image) {
        int n = image.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = image[i][j];
                image[i][j] = image[j][i];
                image[j][i] = temp;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j  = 0; j < n / 2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
        }

        System.out.println(Arrays.deepToString(image));
    }
}
