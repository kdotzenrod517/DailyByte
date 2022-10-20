package linkedlists;

import java.util.Stack;

import static linkedlists.MergeTwoSortedLists.*;

public class LinkedListPalindrome {


    // Runtime: O(N) where N is the total number of elements in our linked list.
    // Space complexity: O(N) where N is the total number of elements in our linked list.
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return true;
        }

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast != null) {
            slow = slow.next;
        }

        Stack<ListNode> stack = new Stack<ListNode>();
        while(slow != null) {
            stack.add(slow);
            slow = slow.next;
        }

        slow = head;
        while(!stack.isEmpty()) {
            if(slow.val != stack.pop().val) {
                return false;
            }

            slow = slow.next;
        }

        return true;
    }
}
