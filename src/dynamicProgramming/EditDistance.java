package dynamicProgramming;

public class EditDistance {

    // Given two strings s and t, return the minimum number of operations needed to
    // convert s into t where a single operation consists of inserting a character, deleting a character,
    // or replacing a character.
    public static void main(String[] args){
        System.out.println(minimumEditDistance("cat", "bat")); // 1
        System.out.println(minimumEditDistance("beach", "batch")); // 2, delete the 'e' in "beach" and add a 't' to the resulting "bach".
    }

    // Runtime: O(N * M) where N is the total number of characters in s and M is the total number of characters in t.
    // Space complexity: O(N * M) where N is the total number of characters in s and M is the total number of characters in t.
    // This results from creating our dp array of size N * M.
    public static int minimumEditDistance(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i <= s.length(); i++) {
            for(int j = 0; j <= t.length(); j++) {
                if(i == 0) {
                    dp[i][j] = j;
                } else if(j == 0) {
                    dp[i][j] = i;
                } else if(s.charAt(i - 1) != t.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[s.length()][t.length()];
    }
}
