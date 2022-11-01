package math;

import java.util.HashMap;

public class RomanNumerals {

    public static void main(String[] args){
        System.out.println(romanNumeral("DCLII")); // 652
        System.out.println(romanNumeral("VIII")); // 8
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    public static int romanNumeral(String s) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int previous = Integer.MAX_VALUE;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(previous != Integer.MAX_VALUE && map.get(s.charAt(i)) < previous) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
                previous = map.get(s.charAt(i));
            }
        }

        return result;
    }
}
