package hot100;

import java.util.HashSet;

public class Issue208_Trie {
    public static void main(String[] args) {
    }
    HashSet<String> set = new HashSet<>();
    HashSet<String> pre= new HashSet<>();
    public Trie() {

    }

    public void insert(String word) {
        set.add(word);
        String a="";
        for(int i = 0; i < word.length(); i++) {
            a+=word.charAt(i);
            pre.add(a);
        }
    }

    public boolean search(String word) {
        return set.contains(word);
    }

    public boolean startsWith(String prefix) {
        return pre.contains(prefix);
    }
}
