package trie;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();
        TrieWithMap trie1 = new TrieWithMap();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("ball");
        trie.insert("ballon");
        trie.insert("big");
        trie.insert("bigggy");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("ap"));
        System.out.println(trie.search("bit"));
        System.out.println(trie.startsWith("app"));
        System.out.println(trie.startsWith("bie"));

        System.out.println("--------------------------------------------------");
        trie1.insert("apple");
        trie1.insert("app");
        trie1.insert("ball");
        trie1.insert("ballon");
        trie1.insert("big");
        trie1.insert("bigggy");
        System.out.println(trie1.search("apple"));
        System.out.println(trie1.search("app"));
        System.out.println(trie1.search("ap"));
        System.out.println(trie1.search("bit"));
        System.out.println(trie1.startsWith("app"));
        System.out.println(trie1.startsWith("bie"));
    }
}
