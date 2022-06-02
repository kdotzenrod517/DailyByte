package DFS;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

import static utils.CreateBST.getBST;

public class RootToLeafPaths {

    public static void main(String[] args) {
        // To store all the path sum
        ArrayList<Integer> pathSum = new ArrayList<>();

        // To store the paths
        ArrayList<String> path = new ArrayList<>();

        // Calling dfs function
        dfsPathSum(getBST(), 0, pathSum);

        searchBT(getBST(), "", path);
        path.forEach(System.out::println);
    }

    public static void searchBT(Node root, String path, List<String> answer) {

        if (root.left == null && root.right == null)
            answer.add(path + root.data);

        if (root.left != null)
            searchBT(root.left, path + root.data + "->", answer);

        if (root.right != null)
            searchBT(root.right, path + root.data + "->", answer);
    }

    public static void dfsPathSum(Node root, int sum, List<Integer> pathSum) {
        // Return if the node is NULL
        if (root == null)
            return;

        // Add value of the node to
        // the path sum
        sum += root.data;

        // Store the path sum if node is leaf
        if (root.left == null &&
                root.right == null) {
            pathSum.add(sum);
            return;
        }

        // Move to the left child
        dfsPathSum(root.left, sum, pathSum);

        // Move to the right child
        dfsPathSum(root.right, sum, pathSum);
    }

}
