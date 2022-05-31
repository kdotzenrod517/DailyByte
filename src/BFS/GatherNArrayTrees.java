package BFS;

import utils.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GatherNArrayTrees {

    public static void main(String[] args){

    }

    // O(n)
    // Given an n-ary tree, return its level order traversal.
    // Note: an n-ary tree is a tree in which each node has no more than N children.
    public static List<List<Integer>> getNaryTreeLevels(Node root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if(root == null) {
            return levels;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i = 0; i < size; i++) {
                Node current = queue.remove();
                level.add(current.data);
                queue.addAll(current.children);
            }

            levels.add(level);
        }

        return levels;
    }
}
