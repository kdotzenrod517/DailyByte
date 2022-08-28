package AdvancedTopics;

public class CanSetSail {

    public static void main(String[] args){
        System.out.println(canSetSail(new char[][]{
                {'O', 'O', 'S'},
                {'S', 'O', 'O'},
                {'O', 'O', 'S'},
        }, 5)); //  return true. You setting sail would cause there to be 4 ships in the harbor which is under the limit of 5.
        System.out.println(canSetSail(new char[][]{
                {'O', 'O', 'O'},
                {'S', 'O', 'S'},
                {'O', 'O', 'S'},
        }, 3)); // return false. The harbor is not safe to sail in since you setting sail would cause the number of boats in the harbor to reach the limit.
    }


    // Runtime: O(N) where N is the total number of cells in harbor.
    // Space complexity: O(1) or constant since regardless of the size of our harbor we only need a few variables to solve our problem.
    public static boolean canSetSail(char[][] harbor, int limit) {
        int ships = 0;
        for(int i = 0; i < harbor.length; i++) {
            for(int j = 0; j < harbor[i].length; j++) {
                if(harbor[i][j] == 'O') {
                    continue;
                }
                if(i > 0 && harbor[i - 1][j] == 'S') {
                    continue;
                }
                if(j > 0 && harbor[i][j - 1] == 'S') {
                    continue;
                }
                ships++;
            }
        }

        return ships < limit - 1;
    }
}
