package utils;

public class CreateBST {

    // root level 0
    public static Node A = Node.createNode(50);
    // Level 1
    public static Node B = Node.createNode(40);
    public static Node C = Node.createNode(60);
    // Level 2
    public static Node D = Node.createNode(30);
    public static Node E = Node.createNode(45);
    public static Node F = Node.createNode(55);
    public static Node G = Node.createNode(70);

    public static Node getBST() {

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
