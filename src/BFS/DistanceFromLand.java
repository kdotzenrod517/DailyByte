package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceFromLand {

    public static void main(String[] args) {
        System.out.println(bfs(new int[][]{
                {0, 0, 1},
                {0, 0, 0},
                {0, 0, 0}
        })); // return 4 (cell (0, 2) is 4 units away from cell (2, 0)).
        System.out.println(bfs(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        })); // return 2
    }

    // Runtime: O(N) where N is the total number of elements in grid.
    // Space complexity: O(N) where N is the total number of elements in grid.
    public static int bfs(int[][] grid){
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    q.add(new int[]{i, j});
                }
            }
        }


        int[][] directions = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int distance = 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int[] coords = q.remove();
                for(int[] direction : directions){
                    int x = coords[0] + direction[0];
                    int y = coords[1] + direction[1];
                    if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] == 0){
                        grid[x][y] = 1;
                        q.offer(new int[]{x, y});
                    }
                }
            }
            distance++;
        }

        return distance == 1 ? -1 : distance - 1;
    }
}
