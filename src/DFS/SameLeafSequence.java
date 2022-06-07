package DFS;

import org.w3c.dom.ls.LSOutput;
import utils.Node;

import java.util.ArrayList;
import java.util.List;

import static utils.CreateBST.getBST;

public class SameLeafSequence {

    public static void main(String[] args){
        System.out.println(leafSimilar(getBST(), getBST()));
    }

    //  O(T1 + T2), T1 and T2 are lengths of the given trees
    public static boolean leafSimilar(Node root1, Node root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public static void dfs(Node node, List<Integer> leafValues) {
        if (node != null) {
            if (node.left == null && node.right == null)
                leafValues.add(node.data);
            dfs(node.left, leafValues);
            dfs(node.right, leafValues);
        }
    }
}
