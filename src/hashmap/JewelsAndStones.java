package hashmap;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {

    public static void main(String[] args){
        System.out.println(jewelsAndStones("abc", "ac")); // 2
        System.out.println(jewelsAndStones("Af", "AaaddfFf")); // 3
        System.out.println(jewelsAndStones("AYOPD", "ayopd")); // 0
    }

    private static int jewelsAndStones(String jewels, String stones) {

        Map<Character, Integer> stoneMap = new HashMap<>();
        int num = 0;

        for(char stone : stones.toCharArray()){
            stoneMap.put(stone, 1 + stoneMap.getOrDefault(stone, 0));
        }

        for(char jewel : jewels.toCharArray()){
            num += stoneMap.getOrDefault(jewel, 0);
        }

        return num;
    }
}
