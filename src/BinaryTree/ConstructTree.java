package BinaryTree;

import utils.Node;

import java.util.HashMap;
import java.util.Map;

public class ConstructTree {

    // Runtime: O(N) where N is the total number of elements in inorder.
    // Space complexity: O(N) where N is the total number of elements in inorder.
    public Node treeReconstruction(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderIndices = new HashMap();
        for (int i = 0; i < inorder.length; i++) {
            inorderIndices.put(inorder[i], i);
        }

        return constructTree(0, preorder.length - 1, preorder, 0, inorder.length - 1, inorder, inorderIndices);
    }

    private static Node constructTree(int preStart, int preEnd, int[] preorder, int inStart, int inEnd, int[] inorder, Map<Integer, Integer> inorderIndices) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        Node root = new Node(preorder[preStart]);
        int index = inorderIndices.get(root.data);
        int leftSubtreeSize = index - inStart;

        root.left = constructTree(preStart + 1, preStart + leftSubtreeSize, preorder, inStart, index - 1, inorder, inorderIndices);
        root.right = constructTree(preStart + leftSubtreeSize + 1, preEnd, preorder, index + 1, inEnd, inorder, inorderIndices);

        return root;
    }
}
