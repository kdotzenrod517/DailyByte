package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters {

    // https://www.callicoder.com/longest-substring-with-k-distinct-characters/
    public static void main(String[] args) {
        System.out.println(test("abccccd", 3)); // return 6 (“abcccc” is length 6)
        System.out.println(test("rrr", 1)); // return 3
    }

    // Sliding window (substring, sub array):
    // While end is valid -> expand window by increasing end
    // While a condition is NOT valid, shrink window by increasing start
    // Keep track of a result and return it

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static int kDistinctCharacters(String s, int k){
            if(s == null || s.length() == 0 || k <= 0) {
                return 0;
            }

            HashMap<Character, Integer> map = new HashMap<>();

            int max = 0;
            int start = 0;
            int end = 0;

            while(end < s.length()) {

                char current = s.charAt(end++);
                map.put(current, map.getOrDefault(current, 0) + 1);

                while(map.size() > k) {
                    char startCharacter = s.charAt(start++);
                    map.put(startCharacter, map.get(startCharacter) - 1);
                    if(map.get(startCharacter) == 0) {
                        map.remove(startCharacter);
                    }
                }

                max = Math.max(max, end - start);
            }

            return max;
    }

    public static int test(String s, int k){
        if(s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int max = 0;

        while(end < s.length()){
            Character curr = s.charAt(end++);
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while(map.size() > k){
                Character startChar = s.charAt(start++);
                map.put(startChar, map.get(startChar) - 1);

                if(map.get(startChar) == 0){
                    map.remove(startChar);
                }
            }

            max = Math.max(max, end - start);
        }

        return max;
    }

    public static int longestSubstring(String s, int k) {
        int n = s.length();

        int maxLen = -1; // Stores the length of the longest substring with k unique characters found so far.
        Map<Character, Integer> windowCharCount = new HashMap<>(); // Stores the character count for each character in the current window
        int windowStart = 0;

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {
            // Add the next character to the sliding window
            char c = s.charAt(windowEnd);
            windowCharCount.put(c, windowCharCount.getOrDefault(c, 0) + 1);

            // Shrink the sliding window, until we have exactly 'k' distinct characters in the window
            while (windowCharCount.size() > k) {
                char leftChar = s.charAt(windowStart);

                // Discard the character at windowStart since we're gonna move it out of the window now.
                windowCharCount.put(leftChar, windowCharCount.get(leftChar) - 1);
                if (windowCharCount.get(leftChar) == 0) {
                    windowCharCount.remove(leftChar);
                }

                windowStart++; // Shrink the window
            }

            if (windowCharCount.size() == k) {
                // Update maximum length found so far
                maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
            }
        }

        return maxLen;
    }
}
