package BinaryTree;

import utils.Node;

public class InvertBinaryTree {

    public static void main(String[] args) {

    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public static Node invertTree(Node root){
        if(root == null)
            return null;

        Node left = root.left;
        Node right = root.right;

        root.left = invertTree(right);
        root.right = invertTree(left);

        return root;
    }
}
