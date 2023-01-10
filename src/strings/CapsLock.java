package strings;

import java.util.HashMap;
import java.util.Map;

public class CapsLock {

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static String capsLock(String s) {
        Map<Character, Character> translations = new HashMap();
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < uppercase.length(); i++) {
            translations.put(uppercase.charAt(i), lowercase.charAt(i));
        }

        StringBuilder lowercased = new StringBuilder();
        for (char c : s.toCharArray()) {
            char next = translations.getOrDefault(c, c);
            lowercased.append(next);
        }

        return lowercased.toString();
    }
}
