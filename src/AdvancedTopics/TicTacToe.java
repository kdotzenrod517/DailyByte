package AdvancedTopics;

public class TicTacToe {

    public static void main(String[] args) {
        System.out.println(ticTacToe(new int[][]{
                {0, 0},
                {1, 0},
                {1, 1},
                {2, 0},
                {2, 2}
        })); // return "A" (player A won with three Xs being connected along the diagonal).
    }

    // Runtime: O(N) where N is the total number of elements in moves.
    // Space complexity: O(1) or constant.
    public static String ticTacToe(int[][] moves) {
        int diagonalOne = 0;
        int diagonalTwo = 0;
        int[] rows = new int[3];
        int[] columns = new int[3];
        int turn = 1;
        for(int[] move: moves) {
            int row = move[0];
            int col = move[1];
            if(row == col) {
                diagonalOne += turn;
            }
            if(row + col == 2) {
                diagonalTwo += turn;
            }
            rows[row] += turn;
            columns[col] += turn;

            if(Math.abs(diagonalOne) == 3
                    || Math.abs(diagonalTwo) == 3
                    || Math.abs(rows[row]) == 3
                    || Math.abs(columns[col]) == 3) {
                return turn == 1 ? "A" : "B";
            }

            turn *= -1;
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}
