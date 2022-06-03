package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class HasPathSum {

    public static void main(String[] args) {
        System.out.println(hasPathSum(getBST(), 45));
    }
       /*
     Given a tree and a sum,
     return true if there is a path
     from the root down to a leaf,
     such that adding up all
     the values along the path
     equals the given sum.

     Strategy: subtract the node
     value from the sum when
     recurring down, and check to
     see if the sum is 0 you reach the leaf node.
     */

    // O(n)
    public static boolean hasPathSum(Node node, int sum) {
        boolean ans = false;
        int subSum = sum - node.data;
        if (subSum == 0 && node.left == null && node.right == null)
            return (ans = true);
        if (node.left != null)

            // ans || hasPathSum... has no utility if the ans is false
            ans = ans || hasPathSum(node.left, subSum);

        if (node.right != null)

            // But if it is true then we can avoid calling hasPathSum
            // here as answer has already been found
            ans = ans || hasPathSum(node.right, subSum);
        return (ans);
    }
}
