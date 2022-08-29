package linkedlists;

import linkedlists.MergeTwoSortedLists.ListNode;
import utils.Node;

import java.util.Stack;

public class ListSum {

    // Given two linked lists that represent two numbers, return the sum of the numbers also represented as a list.
    // a = 1->2, b = 1->3, return a list that looks as follows: 2->5
    // a = 1->9, b = 1, return a list that looks as follows: 2->0

    // Runtime: O(N) where N is the total number of nodes between our two lists.
    // Space complexity: O(N) where N is the total number of nodes between our two lists.
    public ListNode listSum(ListNode a, ListNode b) {
        Stack<ListNode> aStack = reverse(a);
        Stack<ListNode> bStack = reverse(b);

        ListNode dummy = new ListNode(0);
        int carry = 0;
        while(!aStack.isEmpty() || !bStack.isEmpty()) {
            int sum = carry;
            if(!aStack.isEmpty()) {
                sum += aStack.pop().val;
            }

            if(!bStack.isEmpty()) {
                sum += bStack.pop().val;
            }

            dummy.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = dummy;
            dummy = head;
            carry = sum / 10;
        }

        return dummy.val == 0 ? dummy.next : dummy;
    }

    private Stack<ListNode> reverse(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;
        while(current != null) {
            stack.push(current);
            current = current.next;
        }

        return stack;
    }
}
