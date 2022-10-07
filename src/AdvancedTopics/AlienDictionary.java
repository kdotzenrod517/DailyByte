package AdvancedTopics;

import java.security.Signature;

public class AlienDictionary {

    // return false since ‘d’ comes before ‘l’ in the new language’s
    // ordering and therefore the first and second word are not sorted correctly.
    public static void main(String[] args){
        System.out.println(languageEncryption(new String[]{"word","world","row"}, "worldabcefghijkmnpqstuvxyz"));
    }

    // Runtime: O(N) where N is the total number of character in words.
    // Space complexity: O(1) or constant (since our alphabet will always be a size of twenty-six).
    public static boolean languageEncryption(String[] words, String order) {
        int[] alphabet = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            int min = Math.min(words[i].length(), words[i - 1].length());
            for (int j = 0; j < min; j++) {
                char previous = words[i - 1].charAt(j);
                char current = words[i].charAt(j);
                if (alphabet[previous - 'a'] < alphabet[current - 'a']) {
                    break;
                } else if (alphabet[current - 'a'] < alphabet[previous - 'a']) {
                    return false;
                } else if (j == min - 1 && words[i - 1].length() > words[i].length()) {
                    return false;
                }
            }
        }

        return true;
    }
}
