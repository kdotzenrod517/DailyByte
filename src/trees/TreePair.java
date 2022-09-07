package trees;

import utils.Node;

import java.util.HashSet;

public class TreePair {


    public static boolean treePair(Node root, int target) {
        HashSet<Integer> values = new HashSet<>();
        return searchTree(root, values, target);
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public static boolean searchTree(Node root, HashSet<Integer> values, int target) {
        if(root == null){
            return false;
        } else if (values.contains(target - root.data)){
            return true;
        } else {
            values.add(root.data);
            return searchTree(root.left, values, target) ||
                    searchTree(root.right, values, target);
        }
    }
}
