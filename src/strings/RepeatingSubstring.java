package strings;

public class RepeatingSubstring {

    public static void main(String[] args) {
        System.out.println(repeatingSubstring("abcabcab", "abc")); // 2
        System.out.println(repeatingSubstring("ccc", "c")); // 3
    }

    // Runtime: O(N2) where N is the total number of characters in sequence.
    // Space complexity: O(N) where N is the total number of characters in sequence.
    private static int repeatingSubstring(String sequence, String word) {
        int count = 0;
        while(sequence.contains(word.repeat(count))){
            count++;
        }

        return count - 1;
    }
}
