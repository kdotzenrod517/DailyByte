package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class MaxDepth_nArrayTree {

    public static void main(String[] args) {
        System.out.println(maxDepth(getBST()));
    }


    // Runtime: O(N) where N is the total number of nodes in our tree.
    //S pace complexity: O(N) where N is the total number of nodes in our tree.
    // This extra space results from our recursion.
    public static Integer maxDepth(Node root) {
        if (root == null) return 0;

        int max = 0;
        for (Node child : root.children) {
            max = Math.max(max, maxDepth(child));
        }

        return max + 1;
    }

}
