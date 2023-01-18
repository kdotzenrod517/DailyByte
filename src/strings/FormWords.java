package strings;

import java.util.Arrays;

public class FormWords {

    public static void main(String[] args) {
        // return 6 ("abc"'s length + "cab"'s length).
        System.out.println(formWords(new String[]{"abc", "cab"}, "bac"));
    }

    // Runtime: O(N) where N is the total number of characters in words.
    // Space complexity: O(1) or constant.
    public static int formWords(String[] words, String chars) {
        int characterCount = 0;
        int[] available = new int[26];
        for (char c: chars.toCharArray()) {
            available[c - 'a']++;
        }

        for (String word: words) {
            int[] copy = Arrays.copyOf(available, available.length);
            int count = 0;
            for (char c: word.toCharArray()) {
                if (copy[c - 'a'] > 0) {
                    copy[c - 'a']--;
                    count++;
                }
            }

            if (count == word.length()) {
                characterCount += word.length();
            }
        }

        return characterCount;
    }
}
