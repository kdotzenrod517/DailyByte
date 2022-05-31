package utils;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public List<Node> children;

    public Node(int num) {
        this.data = num;
        this.left = null;
        this.right = null;
    }

    public Node() {
        this.left = null;
        this.right = null;
    }

    public Node(int data, List<Node> children) {
        this.data = data;
        this.children = children;
    }

    public static Node createNode(int number) {
        return new Node(number);
    }
}