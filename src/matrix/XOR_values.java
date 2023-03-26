package matrix;

public class XOR_values {

    // Runtime: O(N).
    // Space complexity: O(1) or constant.
    public int xorValues(int N, int start) {
        int result = start;
        for (int i = 1; i < N; i++) {
            result = result ^ (start + 2 * i);
        }

        return result;
    }
}
