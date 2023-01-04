package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringBetweenCharacters {

    public static void main(String[] args) {
        System.out.println(longestSubstringBetweenChars("bbccb")); // 3 ("bcc" is length 3)
        System.out.println(longestSubstringBetweenChars("abb")); // 0
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant since our hash map will at most grow to a size of twenty-six regardless of the size of s.
    public static int longestSubstringBetweenChars(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = -1;

        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(map.containsKey(current)){
                max = Math.max(max, i - map.get(current) - 1);
            } else {
                map.put(current, i);
            }
        }

        return max;
    }
}
