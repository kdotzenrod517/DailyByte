package linkedlists;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

public class OnlyChildren {

    public static void main(String[] args){

    }

    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public static List<Integer> findOnlyChildren(Node root){
        List<Integer> onlyChildren = new ArrayList<>();
        findChildren(root, false, onlyChildren);
        return onlyChildren;
    }

    public static void findChildren(Node root, boolean isOnlyChildren, List<Integer> onlyChildren){
        if(root == null) return;

        if(isOnlyChildren) onlyChildren.add(root.data);

        findChildren(root.left, root.right == null, onlyChildren);
        findChildren(root.right, root.left == null, onlyChildren);
    }
}
