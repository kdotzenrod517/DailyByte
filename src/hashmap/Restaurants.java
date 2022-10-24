package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Restaurants {

    public static void main(String[] args){
        System.out.println(Arrays.toString(restaurants(new String[]{"A", "B", "C", "D"}, new String[]{"D", "B", "C"})));  // (“B” is the least index sum 1 + 1 whereas “D” is 3 + 0).
        System.out.println(Arrays.toString(restaurants(new String[]{"C"}, new String[]{"D"}))); // []
    }

    // Runtime: O(N + M) where N is the size of list and M is the size of list2.
    // Space complexity: O(min(N, M)) where N is the size of list1 and M is the size of list2.
    public static String[] restaurants(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> counts = new HashMap<>();
        for(int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
            counts.put(list1[i], 1);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length; i++) {
            if(map.containsKey(list2[i])) {
                map.put(list2[i], map.get(list2[i]) + i);
                min = Math.min(min, map.get(list2[i]));
            }
            counts.put(list2[i], counts.getOrDefault(list2[i], 0) + 1);
        }

        List<String> commonInterests = new ArrayList<>();
        for(String key: map.keySet()) {
            if(map.get(key) == min && counts.get(key) > 1) {
                commonInterests.add(key);
            }
        }

        String[] result = new String[commonInterests.size()];
        result = commonInterests.toArray(result);
        return result;
    }
}
