package trees;

import utils.Node;

public class KthSmallest {


    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public static int kthSmallest(Node root, int k) {
        int[] result = { k, 0 };
        inorder(root, result);

        return result[1];
    }

    public static void inorder(Node root, int[] result) {
        if(root.left != null) {
            inorder(root.left, result);
        }

        result[0]--;
        if(result[0] == 0) {
            result[1] = root.data;
            return;
        }

        if(root.right != null) {
            inorder(root.right, result);
        }
    }
}
