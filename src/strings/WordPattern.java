package strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {

    public static void main(String[] args) {
        System.out.println(wordPattern("the daily byte", "abc")); // true
        System.out.println(wordPattern("the daily byte curriculum", "abcc")); // false because ‘c’ in code already maps to the word “byte”
        System.out.println(wordPattern("dog cat cat dog", "abba")); // true
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total characters in s.
    public static boolean wordPattern(String str, String pattern) {
        String[] arr = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if (arr.length != pattern.length())
            return false;

        for (int i = 0; i < arr.length; i++) {
            char c = pattern.charAt(i);
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[i]))
                    return false;
            } else {
                if (map.containsValue(arr[i]))
                    return false;
                map.put(c, arr[i]);
            }
        }
        return true;
    }
}
