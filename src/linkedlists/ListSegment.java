package linkedlists;

public class ListSegment {

    // Given a reference to the head of a linked list and two values, m, and n,
    // traverse the entire list keeping the first m elements followed by
    // removing the next n elements. Return the resulting list.

    // Runtime: O(N) where N is the total number of elements in our list.
    // Space complexity: O(1) or constant.
    public MergeTwoSortedLists.ListNode updateLinkedList(MergeTwoSortedLists.ListNode head, int m, int n) {
        MergeTwoSortedLists.ListNode current = head;
        MergeTwoSortedLists.ListNode previous = null;
        while (current != null) {
            int i = m;
            int j = n;

            while (current != null && i-- > 0) {
                previous = current;
                current = current.next;
            }
            while (current != null && j-- > 0) {
                current = current.next;
            }

            previous.next = current;
        }

        return head;
    }
}
