package trees;

import utils.Node;

import static utils.CreateBST.*;

public class MinDistBetweenTwoNodesBST {

    static int min = Integer.MAX_VALUE;
    static Integer prev = null;

    // In order traversal, time O(n)  space O(1)
    public static void main(String[] args){
        System.out.println(getMinimumDifference(getBST()));
    }

    public static int getMinimumDifference(Node root) {

        if (root == null) return min;

        getMinimumDifference(root.left);

        if (prev != null) {
            min = Math.min(min, root.data - prev);
        }

        prev = root.data;

        getMinimumDifference(root.right);

        return min;
    }
}
