package trees;

import utils.Node;

import static utils.CreateBST.getBST;

public class FindValue {

    public static void main(String[] args){
        System.out.println(findNodeInBST(getBST(), 180)); // null
        System.out.println(findNodeInBST(getBST(), 45)); // return node
    }

    public static Node findNodeInBST(Node node, int value){

        if(node == null) return null;

        //Condition 1. we found the value
        if(node.data == value) {
            return node;

        //Condition 2.
        //Value is greater than node value. so go right sub tree
        } else if (node.data < value){
            return findNodeInBST(node.right, value);

        //Condition 3.
        //Value is less than node value. so go left sub tree
        } else {
            return findNodeInBST(node.left, value);
        }
    }
}
