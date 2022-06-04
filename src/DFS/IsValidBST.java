package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class IsValidBST {

    public static void main(String[] args) {
        System.out.println(isValidBST(getBST()));
    }

    public static boolean isValidBST(Node root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(Node root, long lowerLimit, long upperLimit) {

        if (root == null) return true;

        if (root.data <= lowerLimit || root.data >= upperLimit) return false;

        return isValidBST(root.right, root.data, upperLimit) &&
                isValidBST(root.left, lowerLimit, root.data);

    }
}
