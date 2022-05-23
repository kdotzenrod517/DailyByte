package trees;

import utils.Node;

import static utils.CreateBST.A;
import static utils.CreateBST.C;

public class IdenticalTrees {

    public static void main(String[] args){
        System.out.println(isSameTree(A, C));
    }

    public static boolean isSameTree(Node p, Node q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;

        if (p.data != q.data) return false;

        return isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left);
    }
}
