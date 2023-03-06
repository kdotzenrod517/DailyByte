package linkedlists;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {


    public static void main(String[] args) {
//        System.out.println(mergeSorted(new LinkedList<>(List.of(1, 2, 3)), new LinkedList<>(List.of(4, 5, 6))));
//        System.out.println(mergeSorted(new LinkedList<>(List.of(1, 3, 5)), new LinkedList<>(List.of(2, 4, 6))));
//        System.out.println(mergeSorted(new LinkedList<>(List.of(4, 4, 7)), new LinkedList<>(List.of(1, 5, 6))));
    }

    public static ListNode mergeSorted(ListNode l1, ListNode l2) {

       if(l1 == null) return l2;
       if(l2 == null) return l1;

       if(l1.val < l2.val){
           l1.next = mergeSorted(l1.next, l2);
           return l1;
       } else {
           l2.next = mergeSorted(l2.next, l1);
           return l2;
       }
    }

    public static class ListNode {
        public int val;
        public ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
