package DFS.BinaryTree;

import utils.Node;

public class MagicTreeNodes {


    // Runtime: O(N) where N is the total number of elements in our binary tree.
    // Space complexity: O(N) where N is the total number of elements in our binary tree.
    public static int magicNodes(Node root){
        return dfs(root, Integer.MIN_VALUE);
    }

    public static int dfs(Node root, int max){
        if (root == null) return 0;

        int count = root.data >= max ? 1 : 0;
        max = Math.max(root.data, max);
        count += dfs(root.left, max);
        count += dfs(root.right, max);

        return count;
    }
}
