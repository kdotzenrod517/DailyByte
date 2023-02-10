package BinarySearch;

import utils.Node;

public class TrimTree {

    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public Node trimTree(Node root, int low, int high){
        if(root == null)
            return null;

        if(root.data < low){
            return trimTree(root.right, low, high);
        }

        if(root.data > high){
            return trimTree(root.left, low, high);
        }

        root.left = trimTree(root.left, low, high);
        root.right = trimTree(root.right, low, high);
        return root;
    }
}
