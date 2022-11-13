package hashmap;

import java.util.HashMap;

public class CreateOwnPalindrome {

    public static void main(String[] args){
        System.out.println(palindrome("aa")); // 2
        System.out.println(palindrome("abbcaadabac")); // 9
    }

    // Runtime: O(N) where N is the total number of characters in s.
    // Space complexity: O(N) where N is the total number of characters in s.
    public static int palindrome(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int longest = 0;
        boolean hasOddCount = false;

        for(char c : map.keySet()){
            if(map.get(c) % 2 == 0){
                longest += map.get(c);
            } else {
                hasOddCount = true;
                longest += map.get(c) - 1;
            }
        }

        return hasOddCount ? longest + 1 : longest;
    }
}
