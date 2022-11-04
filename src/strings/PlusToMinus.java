package strings;

import java.util.ArrayList;
import java.util.List;

public class PlusToMinus {

    public static void main(String[] args){
        System.out.println(flip("++")); // ["--"]
        System.out.println(flip("++++")); // ["--++","+--+","++--"]
    }

    // Runtime: O(N2) where N is the total number of characters in s.
    // This results from our substring calls within our loop.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static List<String> flip(String s){
        List<String> possibleStates = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                possibleStates.add(s.substring(0, i) + "--" + s.substring(i + 2));
            }
        }

        return possibleStates;
    }
}
