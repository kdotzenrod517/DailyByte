package DFS.BinaryTree;

import utils.Node;

public class BinaryTreeBinaryPath {

    public static int binaryTreeBinaryPath(Node root){
        return calculateSum(root, 0);
    }

    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public static int calculateSum(Node root, int binary){
        int total = 0;
        if(root == null)
            return 0;

        binary =  binary << 1 | root.data;

        // check if node is leaf node
        if(root.left == null && root.right == null){
            return binary; // binary is our decimal representation of the binary path to the current node.
        }

        total += calculateSum(root.left, binary);
        total += calculateSum(root.right, binary);

        return total; //  keeping track of what the decimal total the current path through the tree equates to.
    }
}
