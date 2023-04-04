package linkedlists;

import java.util.List;

import static linkedlists.MergeTwoSortedLists.*;

public class SwapNodes {

    // Runtime: O(N) where N is the total number of elements in our linked list.
    // Space complexity: O(1) or constant.
    public ListNode nodeSwap(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while(curr.next != null && curr.next.next != null){
            ListNode first = curr.next;
            ListNode second = first.next;
            curr.next = second;
            first.next = second.next;
            second.next = first;
            curr = first;
        }

        return dummy.next;
    }
}
