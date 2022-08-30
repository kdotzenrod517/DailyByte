package trees;

import utils.Node;

public class CleanTree {

    // Given the root of a binary tree where every node’s value is either 0 or 1
    // remove every subtree that does not have a 1 in it.

    // Runtime: O(N) where N is the number of nodes in the tree.
    // Space complexity: O(H) where H is the height of the tree.
    public Node cleanTree(Node root){

       if(root == null)
           return null;

       root.left = cleanTree(root.left);
       root.right = cleanTree(root.right);

       if(root.data == 0 && root.left == null && root.right == null){
           root = null;
       }

       return root;
    }
}
