package memoization;

public class LongestCommonSubsequence {

    // Given two strings, s and t, return the length of their longest subsequence.
    public static void main(String[] args){
        System.out.println(longestCommonSubsequence("xyz", "xyz")); // 3
        System.out.println(longestCommonSubsequence("abca", "acea")); // 3
        System.out.println(longestCommonSubsequence("abc", "def")); // 0
    }

    // Runtime: O(N * M) where N is the number of characters in s and M is the number of characters in t.
    // Space complexity: O(N * M) where N is the number of characters in s and M is the number of characters in t.
    // This results from storing our M * N subproblems in our memoize matrix.
    public static int longestCommonSubsequence(String s, String t) {
        int[][] memoize = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                memoize[i][j] = -1;
            }
        }

        return findLongestSubsequence(0, 0, s, t, memoize);
    }

    public static int findLongestSubsequence(int i, int j, String s, String t, int[][] memoize) {
        if (memoize[i][j] != -1) {
            return memoize[i][j];
        }

        int length = 0;
        if (s.charAt(i) == t.charAt(j)) {
            length = 1 + findLongestSubsequence(i + 1, j + 1, s, t, memoize);
        } else {
            length = Math.max(findLongestSubsequence(i + 1, j, s, t, memoize), findLongestSubsequence(i, j + 1, s, t, memoize));
        }

        memoize[i][j] = length;
        return memoize[i][j];
    }
}
