package Backtracking;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SettlingDebts {


    // Given a list of transactions representing the payments between people
    // ([0, 1, 20] representing person 0 paid for person 1 $10),
    // return the minimum number of transactions to settle all debts.
    public static void main(String[] args) {
        System.out.println(settlingDebts(new int[][] {
                {0, 1, 20}
        })); // return 1 (person 1 must pay person 0 $10 back).
        System.out.println(settlingDebts(new int[][] {
                {0, 1, 5},
                {0, 2, 10},
                {2, 1, 15}
        })); // return 2
    }

    // Runtime: O(NN) where N is the total number of unique people.
    // Space complexity: O(N) where N is the total number of unique people.
    public static int settlingDebts(int[][] transactions) {
        Map<Integer, Integer> amountsOwed = new HashMap<>();
        for (int[] t : transactions) {
            amountsOwed.put(t[0], amountsOwed.getOrDefault(t[0], 0) - t[2]);
            amountsOwed.put(t[1], amountsOwed.getOrDefault(t[1], 0) + t[2]);
        }

        List<Integer> debts = amountsOwed.values()
                .stream()
                .filter(debt -> debt != 0)
                .collect(Collectors.toList());

        return payFriends(debts, 0);
    }

    private static int payFriends(List<Integer> debts, int start) {
        while (start < debts.size() && debts.get(start) == 0) {
            start++;
        }

        if (start == debts.size()) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i < debts.size(); i++) {
            if (debts.get(start) * debts.get(i) < 0) {
                debts.set(i, debts.get(i) + debts.get(start));
                min = Math.min(min, 1 + payFriends(debts, start + 1));
                debts.set(i, debts.get(i) - debts.get(start));
            }
        }

        return min;
    }
}
