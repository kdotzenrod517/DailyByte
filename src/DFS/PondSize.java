package DFS;

public class PondSize {

    public static void main(String[] args){
        System.out.println(maxPondSize(new int[][] {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},
        })); // 1

        System.out.println(maxPondSize(new int[][] {
                {1, 0, 1},
                {0, 0, 0},
                {1, 0, 1},
        })); // 5
    }

    public static int maxPondSize(int[][] land) {
        int max = 0;

        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[i].length; j++){
                if(land[i][j] == 0){
                    max = Math.max(max, dfs(land, i, j));
                }
            }
        }

        return max;
    }

    // Runtime: O(N) where N is the total number of cells in our plot of land
    // Space complexity: O(N) where N is the total number of cells in our plot of land. This results from our recursion.
    public static int dfs(int[][] land, int i, int j) {
        if(i < 0 || i >= land.length || j < 0 || j >= land[i].length || land[i][j] == 1)
            return 0;

        int count = 1;
        land[i][j] = 1;

        count += dfs(land, i + 1, j);
        count += dfs(land, i - 1, j);
        count += dfs(land, i, j + 1);
        count += dfs(land, i, j - 1);

        return count;
    }
}
