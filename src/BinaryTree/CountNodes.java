package BinaryTree;

import utils.Node;

public class CountNodes {

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public static int countNodes(Node root){
        int[] result = new int[1];
        if(root == null){
            return 0;
        }
        inOrder(root, result);
        return result[0];
    }

    public static void inOrder(Node root, int[] result){
        if(root.left != null){
            inOrder(root.left, result);
        }

        result[0]++;

        if(root.right != null){
            inOrder(root.right, result);
        }
    }
}
