package DFS;

import utils.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TrimDeadNodes {

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public static List<Node> trimTree(Node root, int[] dead) {
        List<Node> remaining = new ArrayList<>();
        Set<Integer> toRemove = new HashSet<>();
        for(int i: dead) {
            toRemove.add(i);
        }

        removeNodes(root, toRemove, remaining);
        if(!toRemove.contains(root.data)) {
            remaining.add(root);
        }

        return remaining;
    }

    public static Node removeNodes(Node root, Set<Integer> toRemove, List<Node> remaining) {
        if(root == null) {
            return null;
        }

        root.left = removeNodes(root.left, toRemove, remaining);
        root.right = removeNodes(root.right, toRemove, remaining);
        if(toRemove.contains(root.data)) {
            if(root.left != null) {
                remaining.add(root.left);
            }
            if(root.right != null) {
                remaining.add(root.right);
            }

            return null;
        }

        return root;
    }
}
