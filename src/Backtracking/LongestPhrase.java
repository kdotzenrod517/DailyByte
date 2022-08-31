package Backtracking;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestPhrase {

    // Given an array of words, return the length of the longest phrase,
    // containing only unique characters, that you can form by combining the given words together.
    public static void main(String[] args) {
        // return 9 because you can combine all the words,
        // i.e. "the dog ran" since all the characters in the phrase are unique.
        System.out.println(longestPhrase(List.of("the","dog","ran")));
        // return 4 because "flew" is the longest phrase you can create without using duplicate characters.
        System.out.println(longestPhrase(List.of("the","eagle","flew")));

    }

    // Runtime: O(2N * N) where N is the total number of words we’re given.
    // This results from having two choices at each of our N words
    // (i.e. take the current word or don’t take the current word).
    // Space complexity: O(N) where N is the total number of words we’re given.
    // This results from having N levels of recursion.
    public static int longestPhrase(List<String> words) {
        if (words == null || words.size() == 0) {
            return 0;
        }

        int[] max = new int[1];
        findLongestPhrase(words, "", 0, max);
        return max[0];
    }

    private static void findLongestPhrase(List<String> words, String current, int index, int[] max) {
        boolean hasUniqueCharacters = hasUniqueCharacters(current);
        if (hasUniqueCharacters) {
            max[0] = Math.max(max[0], current.length());
        }
        if (index == words.size() || !hasUniqueCharacters) {
            return;
        }

        for (int i = index; i < words.size(); i++) {
            findLongestPhrase(words, current + words.get(i), i + 1, max);
        }
    }

    private static boolean hasUniqueCharacters(String phrase) {
        Set<Character> used = new HashSet<>();
        for (char c: phrase.toCharArray()) {
            if (used.contains(c)) {
                return false;
            }
            used.add(c);
        }

        return true;
    }
}
