package DFS.BinaryTree;

import linkedlists.MergeTwoSortedLists;
import utils.Node;

public class ZigZagTree {

    // We can recursively traverse our tree simulating the different paths
    // that we can take at every node we reach. At every node we reach,
    // we can update a max variable to record the longest zigzag path we’ve
    // been able to create up to this point. At every recursive call, we can
    // also keep track of an isRight variable to allow us to know which
    // direction we should move, left or right, at every one of our recursive
    // calls. If our isRight is true within a recursive call, we can simulate
    // moving to the current node’s left child incrementing our current
    // depth and we can also simulate starting a new path at the current
    // node with another recursive call by continuing to go right to the
    // current node’s right child (similar logic applies for if isRight
    // is false). Once our recursive calls return, we can return the max
    // we were able to find by traversing our entire tree.

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public int zigzagPath(Node root){
        int[] max = new int[]{0};
        dfs(root.right, 1, true, max);
        dfs(root.left, 1, false, max);
        return max[0];
    }

    public static void dfs(Node root, int depth, boolean isRight, int[] max){
        if(root == null)
            return;

        max[0] = Math.max(max[0], depth);
        if(isRight){
            dfs(root.left, depth + 1, false, max);
            dfs(root.right, 1, true, max);
        } else {
            dfs(root.right, depth + 1, true, max);
            dfs(root.left, 1, false, max);
        }
    }
}
