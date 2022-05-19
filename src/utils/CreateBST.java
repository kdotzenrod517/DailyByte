package utils;

public class CreateBST {

    public static Node getBST() {
        // root level 0
        Node A = Node.createNode(50);
        // Level 1
        Node B = Node.createNode(40);
        Node C = Node.createNode(60);
        // Level 2
        Node D = Node.createNode(30);
        Node E = Node.createNode(45);
        Node F = Node.createNode(55);
        Node G = Node.createNode(70);

        // connect Level 0 and 1
        A.left = B;
        A.right = C;
        // connect level 1 and level 2
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;

        return A;
    }
}
