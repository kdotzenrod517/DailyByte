package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class SymmetricalTree {

    public static void main(String[] args){
        System.out.println(isMirror(getBST().left, getBST().right));
    }

    private static boolean isMirror(Node r1, Node r2){
        if(r1 == null && r2 == null) return true;
        if(r1 == null || r2 == null) return false;
        return (r1.data == r2.data) &&
                isMirror(r1.left, r2.right) &&
                isMirror(r1.right, r2.left);
    }
}
