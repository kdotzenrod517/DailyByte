package DFS;

public class NumIslands {

    // Given a 2D array of integers with ones representing land and zeroes representing water,
    // return the number of islands in the grid.
    public static void main(String[] args){
        System.out.println(numIslands(new char[][] {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '1'},
        })); // 3

        System.out.println(numIslands(new char[][] {
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '0'},
                {'0', '0', '0', '0', '1'},
                {'0', '0', '0', '0', '1'},
                {'0', '0', '0', '1', '0'},
        })); // 4
    }

    // Runtime: O(N2) where N is the number of rows and columns in our grid.
    // Space complexity: O(N2) where N is the number of rows and columns in our grid (due to our recursive calls on the stack).
    public static int numIslands(char[][] grid) {

        int numIslands = 0;
        if(grid == null || grid.length == 0){
            return numIslands;
        }

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numIslands++;
                    sink(grid, i, j);
                }
            }
        }

        return numIslands;
    }

    public static void sink(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0'){
            return;
        }

        grid[i][j] = '0';
        sink(grid, i + 1, j);
        sink(grid, i - 1, j);
        sink(grid, i, j + 1);
        sink(grid, i, j -1);
    }

}
