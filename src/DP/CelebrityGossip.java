package DP;

public class CelebrityGossip {

    // Runtime: O(N) where N is the total number of elements in gossip.
    // Space complexity: O(N) where N is the total number of elements in gossip.
    public int celebrityGossip(int N, int[][] gossip) {
        int[] counts = new int[N + 1];
        for (int[] g: gossip) {
            counts[g[0]]--;
            counts[g[1]]++;
        }

        for (int i = 1; i <= N; i++) {
            if (counts[i] == N - 1) {
                return i;
            }
        }

        return -1;
    }
}
