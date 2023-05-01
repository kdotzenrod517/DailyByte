package matrix;

import java.util.ArrayList;
import java.util.List;

public class RequiredVertices {

    public static void main(String[] args) {
        System.out.println(requiredVertices(3, List.of(List.of(0, 1), List.of(1, 2)))); // return [0] (you only need to be able to access vertex zero to reach every other node in the graph).
        System.out.println(requiredVertices(4, List.of(List.of(3, 1), List.of(1, 2), List.of(0, 2)))); // return [0, 3].
    }

    // Runtime: O(N) where N is the total number of elements in edges.
    // Space complexity: O(N) where N is the total number of elements in edges.
    public static List<Integer> requiredVertices(int N, List<List<Integer>> edges){
        List<Integer> requiredVertices = new ArrayList<>();
        int[] seen = new int[N];
        for(List<Integer> edge : edges){
            seen[edge.get(1)] = 1;
        }

        for(int i = 0; i < N; i++){
            if(seen[i] == 0){
                requiredVertices.add(i);
            }
        }

        return requiredVertices;
    }
}
