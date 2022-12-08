package graphs;

import java.util.Arrays;

public class IslandPerimeter {

    public static void main(String[] args) {
        System.out.println(perimeter(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        })); //  4
        System.out.println(perimeter(new int[][]{
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 0}
        })); //  8
    }

    // Runtime: O(N) where N is the total number of elements in our grid.
    // Space complexity: O(1) or constant.
    public static int perimeter(int[][] grid){
        int perimeter = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;
                    if(i > 0 && grid[i - 1][j] == 1){
                        perimeter -= 2;
                    }
                    if(j > 0 && grid[i][j - 1] == 1){
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }

}
