package DFS;

import utils.Node;

public class DiameterOfTree {

    public int treeWidth(Node root){
        int[] max = { 1 };
        dfs(root, max);

        return max[0] - 1;
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public int dfs(Node root, int[] max){
        if(root == null) return 0;

        int left = dfs(root.left, max);
        int right = dfs(root.right, max);
        max[0] = Math.max(max[0], left + right + 1);
        return Math.max(left, right) + 1;
    }
}
