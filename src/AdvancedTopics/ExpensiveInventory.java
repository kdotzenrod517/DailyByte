package AdvancedTopics;

import java.util.*;

public class ExpensiveInventory {

    // You are given a list of values and a list of labels. The ith element in labels represents the label of the ith element.
    // Similarly, the ith element in values represents the value associated with the ith element
    // (i.e. together, an “item” could be thought of as a label and a price). Given a list of values, a list of labels, a limit,
    // and wanted, return the sum of the most expensive items you can group such that the total number of items used is less
    // than wanted and the number of any given label that is used is less than limit.
    public static void main(String[] args) {
        // return 9 (the sum of the values associated with the first, third, and fifth items).
        System.out.println(expensiveInventory(new int[]{5, 4, 3, 2, 1}, new int[]{1, 1, 2, 2, 3}, 3, 1));
    }

    // Runtime: O(NlogN) where N is the total number of elements in values.
    // Space complexity: O(N) where N is the total number of elements in values.
    public static int expensiveInventory(int[] values, int[] labels, int wanted, int limit) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < labels.length; i++) {
            items.add(new Item(values[i], labels[i]));
        }

        PriorityQueue<Item> maxHeap = new PriorityQueue<>((Item a, Item b) -> b.value - a.value);
        maxHeap.addAll(items);

        Map<Integer, Integer> counts = new HashMap<>();
        int value = 0;
        while (!maxHeap.isEmpty() && wanted > 0) {
            Item current = maxHeap.remove();
            counts.put(current.label, counts.getOrDefault(current.label, 0) + 1);
            if (counts.get(current.label) <= limit) {
                value += current.value;
                wanted--;
            }
        }

        return value;
    }

    static class Item {
        int value;
        int label;

        public Item(int value, int label) {
            this.value = value;
            this.label = label;
        }
    }
}
