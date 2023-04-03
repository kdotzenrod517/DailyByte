package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class EvenVowelDistribution {

    public static void main(String[] args) {
        System.out.println(evenVowelDist("aeiouaeioua")); // return 10 (the last 'a' cannot count).
        System.out.println(evenVowelDist("bbb")); // return 3 (all vowels occur an even number of times, i.e. zero times each).
    }

    // Runtime: O(N2) where N is the total number of characters in s.
    // Space complexity: O(1) or constant.
    private static int evenVowelDist(String s) {
        Map<Character, Integer> counts = new HashMap();
        counts.put('a', 0);
        counts.put('e', 0);
        counts.put('i', 0);
        counts.put('o', 0);
        counts.put('u', 0);


        int left = 0;
        int max = 0;
        for (int right = 0; right < s.length(); right++) {
            counts.put(s.charAt(right), counts.getOrDefault(s.charAt(right), 0) + 1);

            Map<Character, Integer> temp = new HashMap();
            temp.put('a', counts.get('a'));
            temp.put('e', counts.get('e'));
            temp.put('i', counts.get('i'));
            temp.put('o', counts.get('o'));
            temp.put('u', counts.get('u'));
            while (temp.values().stream().filter(i -> i % 2 == 1).count() > 0) {
                temp.put(s.charAt(left), temp.getOrDefault(s.charAt(left), 1) - 1);
                left++;
            }

            max = Math.max(max, right - left + 1);
            left = 0;
        }

        return max;
    }
}
