package DFS;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalValues {

    public static void main(String[] args) {
        System.out.println(lexicographicalValues(11)); // return [1, 10, 11, 2, 3, 4, 5, 6, 7, 8, 9].
    }

    public static List<Integer> lexicographicalValues(int n){
        List<Integer> sorted = new ArrayList<>();
        for(int i = 1; i < 10; i++){
            dfs(i, n, sorted);
        }
        return sorted;
    }

    // Runtime: O(N).
    // Space complexity: O(logN).
    public static void dfs(int value, int n, List<Integer> sorted){
        if(value > n){
            return;
        }

        sorted.add(value);
        for(int i = 0; i < 10; i++){
            int next = value * 10 + i;
            if(next > n){
                return;
            }
            dfs(next, n, sorted);
        }
    }
}
