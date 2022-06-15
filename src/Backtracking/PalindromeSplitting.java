package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromeSplitting {

    public static void main(String[] args) {
        partition("abcba").forEach(System.out::println);
    }

    // O(N⋅2^N)
    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(0, result, new ArrayList<>(), s);
        return result;
    }

    static void dfs(int start, List<List<String>> result, List<String> currentList, String s) {
        if (start >= s.length()) result.add(new ArrayList<String>(currentList));
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                // add current substring in the currentList
                currentList.add(s.substring(start, end + 1));
                dfs(end + 1, result, currentList, s);
                // backtrack and remove the current substring from currentList
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) return false;
        }
        return true;
    }
}

