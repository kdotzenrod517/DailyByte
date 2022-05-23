package trees;

import utils.Node;

public class SortedArrayToBST {

    // O(n)
    public static void main(String[] args){
        System.out.println(sortedArrayToBST(new int[]{1, 2, 4, 5, 6}));
    }

    public static Node sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) {
            return null;
        }

       return buildTree(0, nums.length - 1, nums);
    }


    public static Node buildTree(int left, int right, int[] nums) {
        if(left <= right) {
            int mid = left + (right - left) / 2;
            Node root = new Node(nums[mid]);
            root.left = buildTree(left, mid - 1, nums);
            root.right = buildTree(mid + 1, right, nums);

            return root;
        }

        return null;
    }
}
