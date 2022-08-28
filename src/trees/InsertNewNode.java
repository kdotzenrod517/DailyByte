package trees;

import utils.Node;

public class InsertNewNode {


    // Runtime: O(N) where N is the total number of nodes in our tree. This is because in the worst case we’ll traverse all nodes in our tree if our tree looks like a linked list.
    // Space complexity: O(N) where N is the total number of nodes in our tree. This results from having N levels of recursion in the worst case.
    public Node insertNewValue(Node root, int val) {
        if(root == null) {
            return new Node(val);
        } else if(val < root.data) {
            root.left = insertNewValue(root.left, val);
        } else {
            root.right = insertNewValue(root.right, val);
        }

        return root;
    }
}
