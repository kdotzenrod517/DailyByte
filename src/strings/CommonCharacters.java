package strings;

import java.util.ArrayList;
import java.util.List;

public class CommonCharacters {

    public static void main(String[] args){
        System.out.println(commonCharacters(new String[] {"abc", "ab", "a"})); // ["a"]
        System.out.println(commonCharacters(new String[] {"deef", "ddabee", "eebhk"})); //  ["e","e"]
    }

    // Runtime: O(N) where N is the total number of characters within words
    // Space complexity: O(N) where N is the total number of characters within words.
    public static List<String> commonCharacters(String[] words) {
        List<String> commonCharacters = new ArrayList<>();
        int[] counts = new int[26];
        for (int i = 0; i < words[0].length(); i++) {
            counts[words[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < words.length; i++) {
            int[] current = new int[26];
            for (int j = 0; j < words[i].length(); j++) {
                current[words[i].charAt(j) - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (current[j] < counts[j]) {
                    counts[j] = current[j];
                }
            }
        }

        for (int j = 0; j < counts.length; j++) {
            for (int k = 0; k < counts[j]; k++) {
                commonCharacters.add((char)('a' + j) + "");
            }
        }

        return commonCharacters;
    }
}
