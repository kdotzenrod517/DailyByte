package trees;

import utils.Node;

import static utils.CreateBST.getBST;

public class IsSubtree {

    // Runtime: O(N * M) where N is the number of nodes in s and M is the number of nodes in t.
    // Space complexity: O(N)
    public static void main(String[] args){
        System.out.println(isWithinTree(null, getBST()));
    }

    public static boolean isWithinTree(Node s, Node t) {
        if (s == null) {
            return false;
        } else if (s.data == t.data && areIdentical(s, t)) {
            return true;
        } else {
            return isWithinTree(s.left, t) || isWithinTree(s.right, t);
        }
    }

    public static boolean areIdentical(Node s, Node t) {
        if(s == null && t == null) {
            return true;
        } else if(s == null || t == null) {
            return false;
        } else if(s.data != t.data) {
            return false;
        } else {
            return areIdentical(s.left, t.left) && areIdentical(s.right, t.right);
        }
    }
}
