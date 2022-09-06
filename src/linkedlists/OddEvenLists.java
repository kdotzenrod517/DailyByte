package linkedlists;

import java.util.LinkedList;
import java.util.List;

import static linkedlists.MergeTwoSortedLists.*;

public class OddEvenLists {

    // Given a singly linked list, re-order and group its nodes in
    // such a way that the nodes in odd positions come first and the nodes in even positions come last.
    // 4->7->5->6->3->2->1->NULL, return 4->5->3->1->7->6->2->NULL

    // Runtime: O(N) where N is the number of nodes in the list.
    // Space complexity: O(1).
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }
}
