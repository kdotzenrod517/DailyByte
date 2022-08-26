package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedSubstring {

    public static void main(String[] args){
        System.out.println(repeatedStrings("BBBBBBBBBBB")); // [BBBBBBBBBB]
        System.out.println(repeatedStrings("ABABABABABABBBBBBBBBBB")); // [ABABABABAB, BBBBBBBBBB]
    }

    // Runtime: O(N) where N is the total number of characters in our string s.
    // Space complexity: O(N) where N is the total number of characters in our string s
    public static List<String> repeatedStrings(String s) {
        List<String> repeated = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return repeated;
        }

        Map<String, Integer> seen = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String current = s.substring(i, i + 10);
            if (seen.getOrDefault(current, 0) == 1) {
                repeated.add(current);
                seen.put(current, seen.get(current) + 1);
            } else {
                seen.put(current, seen.getOrDefault(current, 0) + 1);
            }
        }

        return repeated;
    }
}
