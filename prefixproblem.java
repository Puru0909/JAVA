import java.util.*;

public class prefixproblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefixes(Node root, String prefix) {
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                findPrefixes(root.children[i], prefix + (char) (i + 'a'));
            }
        }
    }

    public static void main(String args[]) {
        String arr[] = {"zebra", "dog", "duck", "dove"};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
            System.out.println("Inserted: " + arr[i]);
        }

        System.out.println("Finding prefixes:");
        findPrefixes(root, "");
    }
}
