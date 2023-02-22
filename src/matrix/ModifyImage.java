package matrix;

import java.util.Arrays;

public class ModifyImage {

    // To solve this problem we can do a linear scan through our image looking at each cell’s eight neighbors. At every iteration of our loop, we can initialize a sum and a count that will represent the sum of all of our neighbors’ values and the number of neighbors the current cell has respectively. After traversing the eight (at most) possible neighbors, we can assign the average to our resulting images by taking our sumand dividing it by our count and placing the result in the corresponding index of our modified image. Once we’ve modified every pixel, we can return our modified image.
    public static void main(String[] args) {
        System.out.println(Arrays.toString(modifyImage(new int[][]{
                {1, 0},
                {1, 0}
        })));
        // [[0, 0],
        //  [0, 0]]
        System.out.println(Arrays.toString(modifyImage(new int[][]{
                {1, 3, 2},
                {5, 8, 3},
                {4, 4, 3}
        })));
        // [[4, 3, 4],
        //  [3, 3, 3],
        //  [4, 4, 3]]
    }

    // Runtime: O(N) where N is the total number of elements in our image.
    // Space complexity: O(N) where N is the total number of elements in our image.
    public static int[][] modifyImage(int[][] image){
        int[][] modified = new int[image.length][image[0].length];
        int[][] directions = {{0, 0}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}};
        for(int row = 0; row < image.length; row++){
            for(int col = 0; col < image[0].length; col++){
                int sum = 0;
                int count = 0;
                for(int[] direction : directions){
                    int x = direction[0];
                    int y = direction[1];
                    if (inbounds(row + x, col + y, image.length, image[0].length)) {
                        count++;
                        sum += image[row + x][col + y];
                    }
                }
                modified[row][col] = sum / count;
            }
        }

        return modified;
    }

    private static boolean inbounds(int x, int y, int rows, int cols) {
        return x >= 0 && x < rows && y >= 0 && y < cols;
    }
}
