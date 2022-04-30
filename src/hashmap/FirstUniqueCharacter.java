package hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

    public static void main(String[] args){

        System.out.println(firstUniqueChar("abcabd")); // 2
        System.out.println(firstUniqueChar("thedailybyte")); // 1
        System.out.println(firstUniqueChar("developer")); // 0
        System.out.println(firstUniqueChar("tttttt")); // -1

    }

    public static int firstUniqueChar(String s){

        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        for (Character c : s.toCharArray()){
            charMap.put(c, 1 + charMap.getOrDefault(c, 0));
        }

       for(Character c : charMap.keySet()){
           if(charMap.get(c) == 1){
               return s.indexOf(c);
           }
       }

        return -1;
    }
}
