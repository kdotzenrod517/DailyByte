package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NotCommonWords {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(notCommonWords("the quick", "brown fox"))); // ["the", "quick", "brown", "fox"]
        System.out.println(Arrays.toString(notCommonWords("the tortoise beat the haire", "the tortoise lost to the haire"))); // ["beat", "to", "lost"]
        System.out.println(Arrays.toString(notCommonWords("copper coffee pot", "hot coffee pot"))); // ["copper", "hot"]
    }

    public static String[] notCommonWords(String s1, String s2) {

        String[] s1Array = s1.split(" ");
        String[] s2Array = s2.split(" ");

        HashMap<String, Integer> map = new LinkedHashMap<>();

        for(String s : s1Array){
            map.put(s, 1 + map.getOrDefault(s, 0));
        }

        for(String s : s2Array){
            map.put(s, 1 + map.getOrDefault(s, 0));
        }

        String[] response = new String[(int) map.values().stream().filter(i -> i == 1).count()];
        int index = 0;
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                response[index++] = s;
            }
        }

        return response;
    }
}
