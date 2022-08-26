package trees;

import utils.Node;

public class NumPathsToSum {


    // Runtime: O(N2) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree. .
    public static int numPathsSumToK(Node root, int sum) {

        if(root == null) {
            return 0;
        }

        return sumPath(root, sum)
                + numPathsSumToK(root.left, sum)
                + numPathsSumToK(root.right, sum);
    }

    public static int sumPath(Node root, int sum) {
        int paths = 0;

        if(root == null) {
            return 0;
        }

        if(root.data == sum) {
            paths++;
        }

        return paths + sumPath(root.left, sum - root.data)
                + sumPath(root.right, sum - root.data);
    }
}
