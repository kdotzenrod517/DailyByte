package trees;

import utils.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

import static utils.CreateBST.getBST;

public class BSTtoSortedLinkedList {

    public static void main(String[] args) {
        Node node = treeToDoublyList(getBST());
        System.out.println(node);
    }

    public static Node treeToDoublyList(Node root) {
        List<Integer> values = new ArrayList<>();

        Node result = new Node();
        Node current = result;

        inorder(root, values);

        for (int value : values) {
            current.right = new Node(value);
            current = current.right;
        }

        return result.right;
    }

    public static void inorder(Node root, List<Integer> values) {
        if (root == null) {
            return;
        }

        inorder(root.left, values);
        values.add(root.data);
        inorder(root.right, values);
    }
}
