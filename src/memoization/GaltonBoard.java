package memoization;

public class GaltonBoard {

    public static void main(String[] args){
        System.out.println(galtonBoard(2, 2)); // 2, The possible paths are DOWN -> RIGHT and RIGHT -> DOWN
        System.out.println(galtonBoard(4, 3)); // 10
    }

    // Runtime: O(M * N) where M is the total number of rows in our board and N is the total number of columns in our board.
    // Space complexity: O(M * N) where M is the total number of rows in our board and N is the total number of
    // columns in our board. This results from initializing our memoize array to remember solutions to our subproblems.
    public static int galtonBoard(int M, int N) {
        return findPaths(0, 0, new int[M][N]);
    }

    public static int findPaths(int row, int col, int[][] memoize) {
        if (row >= memoize.length || col >= memoize[row].length) {
            return 0;
        } else if (row == memoize.length - 1 || col == memoize[row].length - 1) {
            return 1;
        } else if (memoize[row][col] > 0) {
            return memoize[row][col];
        } else {
            memoize[row][col] = findPaths(row + 1, col, memoize) + findPaths(row, col + 1, memoize);
            return memoize[row][col];
        }
    }
}
