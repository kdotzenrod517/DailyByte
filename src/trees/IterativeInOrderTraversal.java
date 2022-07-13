package trees;

import utils.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static utils.CreateBST.getBST;

public class IterativeInOrderTraversal {

    public static void main(String[] args) {
        inOrderTraversal(getBST()).forEach(System.out::println);
    }

    public static List<Integer> inOrderTraversal(Node root) {

        List<Integer> response = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (!stack.empty() || curr != null) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                response.add(curr.data);
                curr = curr.right;
            }
        }

        return response;
    }
}
