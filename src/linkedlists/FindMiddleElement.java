package linkedlists;

import linkedlists.MergeTwoSortedLists.ListNode;

public class FindMiddleElement {

    // O(n)
    public ListNode findMiddleElement(ListNode head) {
        int count = 0;
        ListNode dummy = head;
        while (dummy != null) {
            dummy = dummy.next;
            count++;
        }

        for (int i = 0; i < count / 2; i++) {
            head = head.next;
        }

        return head;
    }
}
