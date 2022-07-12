package AdvancedTopics;

public class CreateTrie {

    // Runtime of insert and search: O(N) where N is the length of the string we’re inserting or searching for.
    // Space complexity of insert and search: O(N) where N is the length of the string and O(1) respectively.
    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("programming");
        System.out.println(trie.search("computer")); // false
        System.out.println(trie.search("programming")); // true
    }

    static class Node {
        public Node[] children;
        public String word;

        public Node() {
            children = new Node[26];
            word = "";
        }
    }

    public static class Trie {
        private Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new Node();
                }
                current = current.children[c - 'a'];
            }

            current.word = word;
        }

        public boolean search(String word) {
            Node current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return false;
                }

                current = current.children[c - 'a'];
            }

            return current.word.equals(word);
        }
    }
}
