package Backtracking;

public class WordSearch {

    public static void main(String[] args) {

        char[][] board = {{'C', 'A', 'T', 'F'}, {'B', 'G', 'E', 'S'},{'I', 'T', 'A', 'E'}};
        System.out.println(exist(board, "CAT")); // true
        System.out.println(exist(board, "TEA")); // true
        System.out.println(exist(board, "SEAT")); // true
        System.out.println(exist(board, "BAT")); // false
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0) && search(board, i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean search(char[][] board, int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] != word.charAt(count)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = search(board, i + 1, j, count + 1, word)
                || search(board, i - 1, j, count + 1, word)
                || search(board, i, j + 1, count + 1, word)
                || search(board, i, j - 1, count + 1, word);

        board[i][j] = temp;
        return found;
    }
}
