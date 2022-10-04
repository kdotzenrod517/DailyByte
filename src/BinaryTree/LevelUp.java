package BinaryTree;

import utils.Node;

public class LevelUp {

    //       0
    //       \
    //        3, modify the tree such that it becomes...
    //
    //      3
    //       \
    //        3


    //       2
    //    /   \
    //   1     3, modify the tree such that it becomes...
    //
    //      5
    //    /   \
    //   6     3

    //  Leveling-up the tree consists of modifying every node in the tree such that every node’s value
    //  increases by the sum of all the node’s values that are larger than it.
    public Node levelUp(Node root) {
        convert(root , new int[1]);
        return root;
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public void convert(Node root, int[] sum) {
        if (root == null) {
            return;
        }

        convert(root.right, sum);
        root.data += sum[0];
        sum[0] = root.data;
        convert(root.left, sum);
    }
}


