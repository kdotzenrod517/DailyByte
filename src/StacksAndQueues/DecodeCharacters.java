package StacksAndQueues;

import java.util.Stack;

public class DecodeCharacters {

    public static void main(String[] args) {
        System.out.println(decodeCharacters("3[a]2[b]1[c]")); // return "aaabbc" ("a" is repeated 3 times, "b" is repeated 2 times, and "c" is repeated 1 time).
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static String decodeCharacters(String s) {
        String decoded = "";
        Stack<Integer> counts = new Stack();
        Stack<String> characters = new Stack();
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            } else if (s.charAt(index) == '[') {
                characters.push(decoded);
                decoded = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder letters = new StringBuilder(characters.pop());
                letters.append(decoded.repeat(counts.pop()));
                decoded = letters.toString();
                index++;
            } else {
                decoded += s.charAt(index++);
            }
        }

        return decoded;
    }
}
