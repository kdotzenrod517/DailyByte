package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SameVowelCount {

    public static void main(String[] args) {
        System.out.println(sameVowels("laptop")); // return true (there is one vowel in "lap" and one vowel in "top").
        System.out.println(sameVowels("computer")); // false
    }

    // Runtime: O(N) where N is the total number of character in s.
    // Space complexity: O(1) or constant.
    public static boolean sameVowels(String s){
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        int count = 0;
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(vowels.contains(s.charAt(i++))){
                count++;
            }
            if(vowels.contains(s.charAt(j--))){
                count--;
            }
        }


        return count == 0;
    }
}
