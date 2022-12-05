package BinaryTree;

import utils.Node;

public class BoringTree {


    public static boolean boringTree(Node root) {
        return isBoring(root, root.data);
    }

    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public static boolean isBoring(Node root, int val) {
        if (root == null) {
            return true;
        } else if (root.data != val) {
            return false;
        } else {
            return isBoring(root.left, val) && isBoring(root.right, val);
        }
    }
}
