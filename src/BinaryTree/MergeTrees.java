package BinaryTree;

import utils.Node;

public class MergeTrees {

    // Runtime: O(N + M) where N is the number of nodes in a and M is the number of nodes in b.
    // Space complexity: O(max(N, M)) where N is the number of nodes in a and M is the number of nodes in b.
    public Node mergeTrees(Node a, Node b){
        if(a == null && b == null) {
            return null;
        } else if (a == null){
            return b;
        } else if (b == null){
            return a;
        } else {
            Node root = new Node(a.data + b.data);
            root.left = mergeTrees(a.left, b.left);
            root.right = mergeTrees(a.right, b.right);
            return root;
        }
    }
}


