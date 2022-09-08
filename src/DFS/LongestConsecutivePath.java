package DFS;

import utils.Node;

import javax.swing.tree.TreeNode;

public class LongestConsecutivePath {

    public static int longestConsecutive(Node root) {
        if (root == null) {
            return 0;
        }

        int[] max = new int[1];
        findLongest(root, root.data, 0, max);

        return max[0];
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public static void findLongest(Node root, int target, int count, int[] max) {
        if (root == null) {
            return;
        } else if (root.data == target) {
            count++;
            max[0] = Math.max(max[0], count);
        } else {
            count = 1;
        }

        findLongest(root.left, root.data + 1, count, max);
        findLongest(root.right, root.data + 1, count, max);
    }
}
