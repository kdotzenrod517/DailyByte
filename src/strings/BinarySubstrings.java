package strings;

public class BinarySubstrings {

    public static void main(String[] args) {
        System.out.println(binarySubstrings("101")); // 2 ("10" and "01")
        // 4 ("10", "01", "10", "01". "101" does not count since the zeroes and ones are not grouped together).
        System.out.println(binarySubstrings("1011101"));
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int binarySubstrings(String s) {
        int streak = 1;
        int previousStreak = 0;
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                streak++;
            } else {
                previousStreak = streak;
                streak = 1;
            }

            if (previousStreak >= streak) {
                count++;
            }
        }

        return count;
    }
}
