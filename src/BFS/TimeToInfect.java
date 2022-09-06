package BFS;

import java.util.LinkedList;
import java.util.Queue;

public class TimeToInfect {

    // Given a 2D array each cells can have one of three values. Zero represents an empty cell,
    // one represents a healthy person, and two represents a sick person. Each minute that passes,
    // any healthy person who is adjacent to a sick person becomes sick.
    // Return the total number of minutes that must elapse until every person is sick.

    // Note: If it is not possible for each person to become sick, return -1.
    public static void main(String[] args){
        System.out.println(timeToInfect(new int[][]{
                {1,1,1},
                {1,1,0},
                {0,1,2}
        })); // 4
        System.out.println(timeToInfect(new int[][]{
                {1,1,1},
                {0,0,0},
                {2,0,1}
        })); // -1
    }

    // Runtime: O(N) where N is the total number of cells in our grid.
    // Space complexity: O(N) where N is the total number of cells in our grid.
    public static int timeToInfect(int[][] grid) {
        Queue<int[]> sick = new LinkedList<>();
        int healthy = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    healthy++;
                } else if (grid[i][j] == 2) {
                    sick.add(new int[] {i, j});
                }
            }
        }

        int minutes = 0;
        if (healthy == 0) {
            return minutes;
        }

        while (!sick.isEmpty()) {
            int size = sick.size();
            for (int i = 0; i < size; i++) {
                int[] current = sick.remove();
                int[][] directions = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };
                for (int[] direction: directions) {
                    int j = current[0] + direction[0];
                    int k = current[1] + direction[1];
                    if (j >= 0 && j < grid.length && k >= 0 && k < grid[j].length && grid[j][k] == 1) {
                        grid[j][k] = 2;
                        healthy--;
                        sick.add(new int[] {j, k});
                    }
                }
            }

            minutes++;
        }

        return healthy == 0 ? minutes - 1 : -1;
    }
}
