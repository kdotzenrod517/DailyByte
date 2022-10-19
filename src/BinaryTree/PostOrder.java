package BinaryTree;

import utils.Node;

import java.util.ArrayList;
import java.util.List;

public class PostOrder {

    static List<Integer> response = new ArrayList<>();

    // Runtime: O(N) where N is the total number of nodes in our tree
    // Space complexity: O(N) where N is the total number of nodes in our tree
    public static List<Integer> calculate(Node root){
        postOrder(root);
        return response;
    }

    public static void postOrder(Node root){

        if(root == null) return;

        for(Node n : root.children){
            postOrder(n);
        }

        response.add(root.data);
    }
}
