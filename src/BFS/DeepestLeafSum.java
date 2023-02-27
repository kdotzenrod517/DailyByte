package BFS;

import utils.Node;

import java.util.LinkedList;
import java.util.Queue;

// Given the reference to the root of a binary tree, return the sum of all leaves at the deepest level.
public class DeepestLeafSum {

    // Runtime: O(N) where N is the total number of nodes in our tree.
    // Space complexity: O(N) where N is the total number of nodes in our tree.
    public int bfs(Node root){

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum = 0;

        while(!q.isEmpty()){
            sum = 0;
            int size = q.size();
            for(int i = 0; i < size; i++){
                Node curr = q.remove();
                sum += curr.data;
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }

        return sum;
    }
}
