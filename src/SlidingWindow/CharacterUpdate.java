package SlidingWindow;

public class CharacterUpdate {

    public static void main(String[] args) {
        System.out.println(characterUpdate("BBAA", 2)); //  return 4 (both B's can be changed to A's or both A's can be changed to B's).
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int characterUpdate(String s, int k) {
        int[] counts = new int[26];
        int left = 0;
        int max = 0;
        int longest = 0;
        for (int right = 0; right < s.length(); right++) {
            max = Math.max(max, ++counts[s.charAt(right) - 'A']);
            while (right - left + 1 - max > k) {
                counts[s.charAt(left++) - 'A']--;
            }
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
