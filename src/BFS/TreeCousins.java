package BFS;

import utils.Node;

import java.util.LinkedList;
import java.util.Queue;

public class TreeCousins {

    // Runtime: O(N) where N is the total number of elements in our tree.
    // Space complexity: O(N) where N is the total number of elements in our tree.
    public boolean treeCousins(Node root, int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean seenX = false;
            boolean seenY = false;

            for(int i = 0; i < size; i++){
                Node curr = queue.remove();
                if(curr.data == x){
                    seenX = true;
                }
                if(curr.data == y){
                    seenY = true;
                }
                if(curr.left != null && curr.right != null){
                    if(curr.left.data == x && curr.right.data == y){
                        return false;
                    }
                    if(curr.left.data == y && curr.right.data == x){
                        return false;
                    }
                }

                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }
            if(seenX && seenY)
                return true;
        }

        return false;
    }
}
