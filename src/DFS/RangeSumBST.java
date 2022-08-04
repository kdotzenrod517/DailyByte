package DFS;

import utils.Node;

import static utils.CreateBST.getBST;

public class RangeSumBST {

    static int ans;

    public static void main(String[] args){
        System.out.println(rangeSumBST(getBST(), 30, 50));
    }

    public static int rangeSumBST(Node root, int low, int high) {
        ans = 0;
        dfs(root, low, high);
        return ans;
    }

    public static void dfs(Node node, int low, int high) {
        if (node != null) {
            if (low <= node.data && node.data <= high)
                ans += node.data;
            if (low < node.data)
                dfs(node.left, low, high);
            if (node.data < high)
                dfs(node.right, low, high);
        }
    }
}
