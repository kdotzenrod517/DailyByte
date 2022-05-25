package trees;

import utils.Node;

import java.util.Arrays;

import static utils.CreateBST.getBST;

public class FindTheMode {

    private static int currVal;
    private static int currCount = 0;
    private static int maxCount = 0;
    private static int modeCount = 0;
    private static int[] modes;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findTheMode(getBST())));
    }

    public static int[] findTheMode(Node root) {
        inorder(root);
        modes = new int[modeCount];
        modeCount = 0;
        currCount = 0;
        inorder(root);
        return modes;
    }

    private static void handleValue(int val) {
        if (val != currVal) {
            currVal = val;
            currCount = 0;
        }
        currCount++;
        if (currCount > maxCount) {
            maxCount = currCount;
            modeCount = 1;
        } else if (currCount == maxCount) {
            if (modes != null)
                modes[modeCount] = currVal;
            modeCount++;
        }
    }

    private static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        handleValue(root.data);
        inorder(root.right);
    }
}
