package BinaryTree;

import utils.Node;

public class RemoveLeavesWithTarget {


    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public Node removeLeavesWithTarget(Node root, int target){
        if(root.left != null){
            root.left = removeLeavesWithTarget(root.left, target);
        }
        if(root.right != null){
            root.right = removeLeavesWithTarget(root.right, target);
        }

        return root.left == root.right && root.data == target ? null : root;
    }
}
