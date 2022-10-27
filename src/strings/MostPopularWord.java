package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostPopularWord {

    public static void main(String[] args){
        System.out.println(mostPopular("The daily, the byte Daily.", new String[] {"the"})); // daily
    }

    // Runtime: O(N + M) where N is the total number of words in paragraph and M is the total number of elements in banned.
    // Space complexity: O(N + M) where N is the total number of words in paragraph and M is the total number of elements in banned.
    public static String mostPopular(String word, String[] banned){
        List<String> ignore = new ArrayList<>(Arrays.asList(banned));

        HashMap<String, Integer> counts = new HashMap<>();
        for(String s : word.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){
            if(!ignore.contains(s)) {
                counts.put(s, counts.getOrDefault(s, 0) + 1);
            }
        }

        String response = "";
        for(String s : counts.keySet()){
            if(response.equals("") || counts.get(s) > counts.get(response)){
                response = s;
            }
        }
        return response;
    }
}
