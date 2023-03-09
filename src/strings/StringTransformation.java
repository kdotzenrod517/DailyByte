package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringTransformation {

    public static void main(String[] args) {
        System.out.println(stringTransformation("abc", "bbc")); // return true (convert all "a" characters to "b" characters).
        System.out.println(stringTransformation("bbd", "cde")); // false
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    private static boolean stringTransformation(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        if(s.equals(t)){
            return true;
        }

        for(int i = 0; i < s.length(); i++){

            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

            if(map.getOrDefault(c1, c2) != c2){
                return false;
            }

            map.put(c1, c2);
        }

        return new HashSet<>(map.values()).size() < 26;
    }
}
