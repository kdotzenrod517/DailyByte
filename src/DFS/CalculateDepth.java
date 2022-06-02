package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class CalculateDepth {

    public static void main(String[] args) {
        System.out.println(maxDepth(getBST()));
    }

    // O(n)
    public static int maxDepth(final Node root) {
        if (root == null) return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
