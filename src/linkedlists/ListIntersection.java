package linkedlists;

import linkedlists.MergeTwoSortedLists.ListNode;

import java.util.HashSet;

public class ListIntersection {


    // Runtime: O(N + M) where N is the length of list A and M is the length of list B.
    // Space complexity: O(N) where N is the length of list A.
    public ListNode intersection(ListNode a, ListNode b){
        HashSet<ListNode> visited = new HashSet<>();
        while(a != null){
            visited.add(a);
            a = a.next;
        }

        while (b != null){
            if(visited.contains(b)){
                return b;
            }
            b = b.next;
        }

        return null;
    }
}


