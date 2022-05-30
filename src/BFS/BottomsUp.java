package BFS;

import utils.Node;

import java.util.*;

import static utils.CreateBST.getBST;

public class BottomsUp {

    public static void main(String[] args){
        System.out.println(bottomUpTraversal(getBST()));
    }

    // O(n)
    public static List<List<Integer>> bottomUpTraversal(Node root) {
        List<List<Integer>> levels = new ArrayList<>();
        if(root == null) {
            return levels;
        }

        Stack<List<Integer>> stack = new Stack<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node current = queue.remove();
                level.add(current.data);
                if(current.left != null) {
                    queue.add(current.left);
                }
                if(current.right != null) {
                    queue.add(current.right);
                }
            }
            stack.add(level);
        }

        while (!stack.isEmpty()) {
            levels.add(stack.pop());
        }

        return levels;
    }
}
