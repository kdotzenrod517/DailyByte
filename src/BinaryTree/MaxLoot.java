package BinaryTree;

import utils.Node;

import java.io.StreamTokenizer;

public class MaxLoot {


    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public int rob(Node root) {
        if (root == null) return 0;

        int ans = 0;

        // max value from left grandchildren
        if (root.left != null) {
            ans += rob(root.left.left) + rob(root.left.right);
        }

        // max value from right grandchildren
        if (root.right != null) {
            ans += rob(root.right.left) + rob(root.right.right);
        }

        return Math.max(ans + root.data, rob(root.left) + rob(root.right));  //(Case1,Case2)
    }
}
