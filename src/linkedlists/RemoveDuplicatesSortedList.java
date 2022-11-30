package linkedlists;

import linkedlists.MergeTwoSortedLists.ListNode;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesSortedList {

    public static void main(String[] args){
    }

    // Runtime: O(N) where N is the total number of nodes in our list.
    // Space complexity: O(1) or constant.
    public static ListNode removeDupes(ListNode head){
        ListNode curr = head;
        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }
}
