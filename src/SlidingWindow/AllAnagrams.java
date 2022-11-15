package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagrams {

    public static void main(String[] args){
        System.out.println(allAnagrams("abcbabc", "abc")); //  [0, 2, 4]
        System.out.println(allAnagrams("abc", "def")); // []
    }

    // Runtime: O(N + M) where N is the number of characters in s and M is the number of characters in p.
    // Space complexity: O(1) or constant.
    public static List<Integer> allAnagrams(String s, String p) {
        List<Integer> anagramIndices = new ArrayList();
        if (p.length() > s.length()) {
            return anagramIndices;
        }

        int [] sCount = new int[26];
        int [] pCount = new int[26];
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sCount[s.charAt(i - p.length()) - 'a']--;
            }

            if (Arrays.equals(sCount, pCount)) {
                anagramIndices.add(i - p.length() + 1);
            }
        }

        return anagramIndices;
    }
}
