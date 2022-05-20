package trees;

import utils.Node;

import static utils.CreateBST.getBST;

public class BSTtoSortedLinkedList {
    static Node prev = null;

    public static void main(String[] args){
        Node node = treeToDoublyList(getBST());
        System.out.println(node);
    }

    public static Node treeToDoublyList(Node root) {
        // use dummy Node
        if(root == null) return root;

        Node dummy = new Node (0);
        prev = dummy;
        inorder(root);

        // connect head and tail
        prev.right = dummy.right;
        dummy.right.left = prev;
        return dummy.right;
    }

    private static void inorder(Node cur){
        if(cur == null) return;
        inorder(cur.left);
        prev.right = cur;
        cur.left = prev;
        prev = cur;
        inorder(cur.right);
    }
}
