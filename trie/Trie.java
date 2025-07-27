package trie;

public class Trie {
    static class TrieNode{
        TrieNode []children;
        boolean isEndOfWord;
        TrieNode(){
            children = new TrieNode[26];
            isEndOfWord  = false;
        }
    }
    private  final TrieNode root = new TrieNode();
    public  void insert(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            int index = ch-'a';
            if(node.children[index]==null){
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord=true;
    }

    public  boolean search(String word){
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            int index = ch-'a';
            if(node.children[index]==null){
                return false;
            }
            node = node.children[index];
        }
        return node!=null && node.isEndOfWord;
    }
    public boolean startsWith(String prefix){
        TrieNode node = root;
        for(char ch : prefix.toCharArray()){
            int index = ch-'a';
            if(node.children[index]==null){
                return false;
            }
            node = node.children[index];
        }
        return true;
    }
}
