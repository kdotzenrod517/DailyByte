package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindBunches {

    public static void main(String[] args){
        System.out.println(findBunches("aaabbbccc")); // [[0,2],[3,5],[6,8]]
        System.out.println(findBunches("aaabbcddddd")); // [[0,2],[6,10]]
    }

    // Runtime: O(N2) where N is the total number of characters in S.
    // Space complexity: O(N) where N is the total number of characters in S.
    public static List<List<Integer>> findBunches(String s){

        List<List<Integer>> result = new ArrayList<>();
        int start = 0;

        for(int i = 0; i <= s.length(); i++){
            if (i == s.length() || s.charAt(i) != s.charAt(start)) {
                if(i - start >= 3){
                    result.add(Arrays.asList(start, i - 1));
                }
                start = i;
            }
        }

        return result;
    }
}
