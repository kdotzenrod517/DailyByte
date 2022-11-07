package strings;

import java.util.HashSet;
import java.util.Set;

public class UpsideDownNumber {

    public static void main(String[] args){
        System.out.println(upsidedownNumber("0")); // true
        System.out.println(upsidedownNumber("96")); // true
        System.out.println(upsidedownNumber("003821")); // false
    }

    // Runtime: O(N) where N is the total number of characters in num.
    // Space complexity: O(1) or constant.
    public static boolean upsidedownNumber(String num){
        Set<String> valid = new HashSet<>();
        valid.add("00");
        valid.add("11");
        valid.add("88");
        valid.add("69");
        valid.add("96");

        int i = 0;
        int j = num.length() - 1;

        while(i <= j){
            if(!valid.contains(num.charAt(i++) + "" + num.charAt(j--))){
                return false;
            }
        }

        return true;
    }
}
