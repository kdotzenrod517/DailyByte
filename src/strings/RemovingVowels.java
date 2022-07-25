package strings;

import java.util.HashSet;
import java.util.Set;

public class RemovingVowels {

    public static void main(String[] args) {
        System.out.println(removingVowels("aeiou")); // ""
        System.out.println(removingVowels("byte")); // byt
        System.out.println(removingVowels("xyz")); // xyz
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of character in s.
    // This results from building our new string builder to eventually return.
    public static String removingVowels(String s){
        String vowels = "aeiouAEIOU";
        Set<Character> toRemove = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < vowels.length(); i++) {
            toRemove.add(vowels.charAt(i));
        }

        for (char c: s.toCharArray()) {
            if (!toRemove.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();

    }
}
