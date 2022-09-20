package DFS;

import utils.Node;

public class MaxSum {


    public static int maxSum(Node root){

        int[] result = new int[]{Integer.MIN_VALUE};
        maxPath(root, result);

        return result[0];
    }

    // Runtime: O(N) where N is the number of nodes in our tree.
    // Space complexity: O(N) where N is the number of nodes in our tree.
    private static int maxPath(Node root, int[] result) {
        if(root == null) return 0;

        int left = Math.max(maxPath(root.left, result), 0);
        int right = Math.max(maxPath(root.right, result), 0);
        result[0] = Math.max(result[0], root.data + left + right);

        return root.data + Math.max(left, right);
    }

}
