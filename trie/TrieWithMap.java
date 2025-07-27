package trie;

import java.util.HashMap;
import java.util.Map;

public class TrieWithMap {
    static class TrieNode{
        Map<Character, TrieNode> children;
        boolean isEndOfWord;
        TrieNode(){
            children = new HashMap<>();
            isEndOfWord = false;
        }
    }
    private final TrieNode root = new TrieNode();

    public void insert(String word){
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            node = node.children.computeIfAbsent(ch,c->new TrieNode());
        }
        node.isEndOfWord=true;
    }
    public boolean search(String word){
        TrieNode node = root;
        for(char ch : word.toCharArray()){
            node = node.children.get(ch);
            if(node==null) return false;
        }
        return node.isEndOfWord;
    }
    public  boolean startsWith(String prefix){
        TrieNode node = root;
        for (char ch : prefix.toCharArray()){
            node = node.children.get(ch);
            if(node==null) return false;
        }
        return true;
    }
}
