package trees;

import utils.Node;

import static utils.CreateBST.*;

public class LowestCommonAncestor {

    public static void main(String[] args){
        System.out.println(lca(getBST(), B, F).data);
    }

    public static Node lca(Node root, Node a, Node b){
        if(root == null || root == a || root == b) return root;
        Node left = lca(root.left, a, b);
        Node right = lca(root.right, a, b);
        if(left != null && right != null) return root;
        return left != null ? left : right;
    }
}
