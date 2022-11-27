package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class PennyPicking {

    public static void main(String[] args){
        System.out.println(pennyPicking(new int[]{2, 1, 4, 4})); // true
        System.out.println(pennyPicking(new int[]{2, 1, 4, 9, 3, 8})); // true
    }

    // Runtime: O(N2) where N is the total number of piles in piles.
    // Space complexity: O(N2) where N is the total number of piles in piles.
    public static boolean pennyPicking(int[] piles) {
        Map<String, Boolean> dp = new HashMap<>();
        return simulateGame(piles, 0, piles.length - 1, 0, 0, dp);
    }

    private static Boolean simulateGame(int[] piles, int left, int right, int yourScore, int friendScore, Map<String,Boolean> dp) {
        if (left > right) {
            return yourScore > friendScore;
        }

        String state = left + "-" + right;
        if (dp.containsKey(state)) {
            return dp.get(state);
        }

        if ((left + right) % 2 == 0) {
            boolean canWin = simulateGame(piles, left + 1, right, yourScore + piles[left], friendScore, dp)
                    || simulateGame(piles, left, right - 1, yourScore + piles[right], friendScore, dp);
            dp.put(state, canWin);
            return canWin;
        }

        boolean canWin = simulateGame(piles, left + 1, right, yourScore, friendScore + piles[left], dp)
                || simulateGame(piles, left, right - 1, yourScore, friendScore + piles[right], dp);
        dp.put(state, canWin);

        return canWin;
    }
}
