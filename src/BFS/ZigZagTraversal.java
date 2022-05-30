package BFS;
import utils.Node;

import java.util.*;

import static utils.CreateBST.getBST;

public class ZigZagTraversal {

    public static void main(String[] args){
        System.out.println(zigzagTraversal(getBST()));
    }

    // O(n)
    public static List<List<Integer>> zigzagTraversal(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int count = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> level = new LinkedList<Integer>();
            for(int i = 0; i < size; i++) {
                Node current = queue.remove();
                if(count % 2 == 0) {
                    level.addLast(current.data);
                } else {
                    level.addFirst(current.data);
                }

                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }

            count++;
            result.add(new ArrayList<Integer>(level));
        }

        return result;
    }
}
