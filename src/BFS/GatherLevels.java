package BFS;

import utils.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static utils.CreateBST.getBST;

public class GatherLevels {

    public static void main(String[] args) {
        System.out.println(levelOrder(getBST()));
    }

    public static List<List<Integer>> levelOrder(Node root) {

        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if (root == null)
            return wrapList;

        queue.offer(root);

        while (!queue.isEmpty()) {

            List<Integer> subList = new LinkedList<>();
            int levelNum = queue.size();

            for (int i = 0; i < levelNum; i++) {

                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            wrapList.add(subList);
        }

        return wrapList;
    }
}
