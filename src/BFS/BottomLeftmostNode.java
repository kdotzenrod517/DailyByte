package BFS;

import utils.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BottomLeftmostNode {

    // Runtime: O(N) where N is the total number of nodes in the tree.
    // Space complexity: O(N) where N is the total number of nodes in the tree.
    public int bottomOfTheBarrel(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int result = root.data;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.remove();
                if (i == 0) {
                    result = node.data;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        return result;
    }
}
