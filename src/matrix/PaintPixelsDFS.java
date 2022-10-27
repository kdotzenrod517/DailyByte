package matrix;

import java.util.Arrays;

public class PaintPixelsDFS {

    public static void main(String[] args){
        System.out.println(Arrays.deepToString(changePixels(new int[][]{
                {0, 1, 1},
                {0, 1, 0},
                {1, 1, 1}
        }, 1, 1, 3)));
        // image =
        // [[0, 3, 3],
        //  [0, 3, 0],
        //  [3, 3, 3]]
    }

    public static int[][] changePixels(int[][] graph, int row, int column, int color){
        if(graph[row][column] == color) return graph;
        dfs(graph, row, column, graph[row][column], color);
        return graph;
    }

    // Runtime: O(N) where N is the total number of values in image.
    // Space complexity: O(N) where N is the total number of values in image. This results from our recursive calls.
    public static void dfs(int[][] graph, int i, int j, int color, int newColor){
        if(i < 0 || i >= graph.length || j < 0 || j >= graph[i].length || graph[i][j] != color) return;
        graph[i][j] = newColor;
        dfs(graph, i + 1, j, color, newColor);
        dfs(graph, i - 1, j, color, newColor);
        dfs(graph, i, j + 1, color, newColor);
        dfs(graph, i, j - 1, color, newColor);
    }
}
