package BFS;

import utils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static utils.CreateBST.getBST;

public class MaxValuePerLevel {

    public static void main(String[] args){
        System.out.println(maxValueInLevels(getBST()));
    }

    // O(n)
    public static List<Integer> maxValueInLevels(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;

        while(!queue.isEmpty()) {

            int max = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++) {
                Node node = queue.remove();
                max = Math.max(max, node.data);

                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }

            size = queue.size();
            result.add(max);
        }

        return result;
    }
}
