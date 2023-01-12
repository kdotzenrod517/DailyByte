package matrix;


public class WealthiestRow {

    public static void main(String[] args) {
        System.out.println(wealthiestRow(new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        })); // return 15 (4 + 5 + 6 = 15)
        System.out.println(wealthiestRow(new int[][]{
                {1, 2},
                {2, 1}
        })); // return 3
    }

    // Runtime: O(N) where N is the total number of elements in accounts.
    // Space complexity: O(1) or constant.
    public static int wealthiestRow(int[][] accounts) {
        int wealthiest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }
            wealthiest = Math.max(curr, wealthiest);
        }


        return wealthiest;
    }
}
