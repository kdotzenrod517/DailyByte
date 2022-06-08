package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class SumLeftLeaves {

    public static void main(String[] args) {
        System.out.println(sumLeftLeaves(getBST()));
    }

    // O(n)
    public static int sumLeftLeaves(Node root) {

        if (root == null)
            return 0;

        int result = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            result += root.left.data;
        }

        return result + sumLeftLeaves(root.left) + sumLeftLeaves(root.right);
    }
}
