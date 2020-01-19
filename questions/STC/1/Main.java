import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SuffixTrie trie = new SuffixTrie("babc");
        trie.print("");
        boolean exist = trie.contains("abc");

        assert exist == true : "Wrong Answer";
        System.out.println("Correct Answer");
    }
}

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();

    public void print(String prefix) {
        Iterator<Entry<Character, TrieNode>> it = children.entrySet().iterator();

        while (it.hasNext()) {
            Entry<Character, TrieNode> entry = it.next();
            if (entry.getKey() == '*') {
                System.out.println(prefix + " " + entry.getKey());
            }
            entry.getValue().print(prefix + " " + entry.getKey());
        }
    }
}

class SuffixTrie {
    TrieNode root = new TrieNode();
    TrieNode trueNode = new TrieNode();

    char endSymbol = '*';

    public SuffixTrie(String str) {
        populateSuffixTrieFrom(str);
    }

    public void populateSuffixTrieFrom(String str) {
        for (int i = 0; i < str.length(); i++) {
            String subStr = str.substring(i, str.length());

            TrieNode node = root;
            for (int j = 0; j < subStr.length(); j++) {
                Character s = subStr.charAt(j);

                if (node.children.containsKey(s)) {
                    node = node.children.get(s);
                } else {
                    node.children.put(s, new TrieNode());
                    node = node.children.get(s);
                }
            }

            node.children.put('*', trueNode);
        }

    }

    public void print(String prefix) {
        root.print(prefix);
    }

    public boolean contains(String str) {
        TrieNode node = root;

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (node.children.containsKey(ch)) {
                node = node.children.get(ch);
            } else {
                return false;
            }
        }
        return node.children.containsKey('*');
    }
}