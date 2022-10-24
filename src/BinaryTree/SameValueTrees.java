package BinaryTree;

import utils.Node;

public class SameValueTrees {

    public int countSubtrees(Node root) {
        int[] count = new int[1];
        if(root == null) {
            return count[0];
        }

        countSameValueSubtrees(root, count);
        return count[0];
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree. This results from our recursion.
    public boolean countSameValueSubtrees(Node root, int[] count) {
        if(root == null) {
            return true;
        }

        boolean left = countSameValueSubtrees(root.left, count);
        boolean right = countSameValueSubtrees(root.right, count);
        if(left && right) {
            if(root.left != null && root.data != root.left.data) {
                return false;
            }
            if(root.right != null && root.data != root.right.data) {
                return false;
            }

            count[0]++;
            return true;
        }

        return false;
    }
}
