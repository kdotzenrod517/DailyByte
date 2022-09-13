package heaps;

import java.util.*;

public class TopKFrequentWords {


    public static void main(String[] args) {
        countingWords(new String[]{"the", "daily", "byte", "byte"}, 1).forEach(System.out::println); // ["byte"]
        System.out.println(String.join(", ", countingWords(new String[]{"coding", "is", "fun", "code", "coding", "fun"}, 2))); //  ["coding","fun"]
    }

    // Runtime: O(NlogN) where N is the total number of elements in words.
    // Space complexity: O(N) where N is the total number of elements in words.
    public static List<String> countingWords(String[] words, int k) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            if (wordCount.get(a) == wordCount.get(b)) {
                return b.compareTo(a);
            }
            return wordCount.get(a) - wordCount.get(b);
        });

        for (String key : wordCount.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.remove();
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(0, minHeap.remove());
        }

        return result;
    }
}
