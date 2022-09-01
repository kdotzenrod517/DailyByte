package graphs;

import java.util.Arrays;
import java.util.Stack;

public class isBipartite {

    public static void main(String[] args){
        System.out.println(checkIfGraphIsBipartite(new int[][]{
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        })); // true
        System.out.println(checkIfGraphIsBipartite(new int[][]{
                {1, 2},
                {0, 2, 3},
                {0, 1, 3},
                {0, 2}
        })); // false
    }

    // Runtime: O(N + E) where N is the number of node in the graph and E is the number of Edges.
    // This results from us iterating through both of them entirely.
    // Space complexity: O(N) which is the space used to store the colors array.
    public static boolean checkIfGraphIsBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        Arrays.fill(colors, -1);

        for (int baseNode = 0; baseNode < graph.length; baseNode++) {
            if (colors[baseNode] == -1) {
                Stack<Integer> stack = new Stack();
                stack.push(baseNode);
                colors[baseNode] = 0;

                while (!stack.empty()) {
                    Integer currentNode = stack.pop();
                    for (int neighborNode: graph[currentNode]) {
                        if (colors[neighborNode] == -1) {
                            stack.push(neighborNode);
                            colors[neighborNode] = colors[currentNode] ^ 1;
                        } else if (colors[neighborNode] == colors[currentNode]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
