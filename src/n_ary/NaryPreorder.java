package n_ary;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryPreorder {

    public static List<Integer> preorder(Node root){
        List<Integer> values = new ArrayList<>();
        preorder(root, values);
        return values;
    }

    // Runtime: O(N) where N is the number of elements in our tree.
    // Space complexity: O(N) where N is the number of elements in our tree.
    public static void preorder(Node root, List<Integer> values){
        if(root == null){
            return;
        }

        values.add(root.data);
        for(Node child : root.children){
            preorder(child, values);
        }
    }
}
