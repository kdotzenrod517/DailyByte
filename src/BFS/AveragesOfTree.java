package BFS;

import utils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static utils.CreateBST.getBST;

public class AveragesOfTree {

    public static void main(String[] args) {
        System.out.println(averageOfLevels(getBST()));
    }

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    // This results from utilizing a queue for our breadth-first search.
    public static List<Double> averageOfLevels(Node root) {
        List<Double> averages = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                Node current = queue.remove();
                sum += current.data;
                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                }
            }

            averages.add(sum / size);
        }

        return averages;
    }
}
