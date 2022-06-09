package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static void main(String[] args) {
        stringPermutations("c7w2").forEach(System.out::println);
    }

   // Runtime: O(2N) where N is the total number of characters in S.
   // This results from us having 2 choices at every character in the worst case
   // (i.e. uppercase the current letter and lowercase the current letter)

   // Space complexity: O(2N) where N is the total number of characters in S.
   // This results from us storing all 2N permutations of S.
    public static List<String> stringPermutations(String S) {
        List<String> permutations = new ArrayList<String>();
        generatePermutations(S, 0, permutations, "");
        return permutations;
    }

    public static void generatePermutations(String S, int index, List<String> permutations, String current) {
        if (index >= S.length()) {
            permutations.add(current);
            return;
        }

        char c = S.charAt(index);
        if (Character.isLetter(c)) {
            generatePermutations(S, index + 1, permutations, current + Character.toUpperCase(c));
            generatePermutations(S, index + 1, permutations, current + Character.toLowerCase(c));
        } else {
            generatePermutations(S, index + 1, permutations, current + c);
        }
    }
}
