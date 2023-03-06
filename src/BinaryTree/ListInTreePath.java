package BinaryTree;

import linkedlists.MergeTwoSortedLists;
import utils.Node;

import static linkedlists.MergeTwoSortedLists.*;

public class ListInTreePath {

    // Runtime: O(N2) where N is the total number of nodes in our tree.
    // Space complexity: O(min(N, M)) where N is the total number of nodes in our tree and M is the total number of nodes in our list.
    public boolean listInTreePath(ListNode head, Node root) {
        if (head == null) {
            return true;
        } else if (root == null) {
            return false;
        } else {
            return traverse(head, root) ||
                    listInTreePath(head, root.left) ||
                    listInTreePath(head, root.right);
        }
    }

    private static boolean traverse(ListNode head, Node root) {
        if (head == null) {
            return true;
        } else if (root == null) {
            return false;
        } else {
            return head.val == root.data &&
                    (traverse(head.next, root.left) || traverse(head.next, root.right));
        }
    }
}
