package linkedlists;

import linkedlists.MergeTwoSortedLists.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
        return head;
    }
}
