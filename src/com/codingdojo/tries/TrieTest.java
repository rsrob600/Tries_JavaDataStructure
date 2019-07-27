package com.codingdojo.tries;

import java.util.Set;
public class TrieTest {

	public static void main(String[] args) {

		Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
		
        
        System.out.println("---------------root keys---------------");
        Set<Character> keys1 = trie.root.children.keySet();
        for(Character key : keys1) {
        	System.out.println(key);
        }
        
        System.out.println("---------------children of 'c' keys---------------");
        
        Set<Character> keys2 = trie.root.children.get('c').children.keySet();
        for(Character key : keys2) {
        	System.out.println(key);
        }
        
        System.out.println("---------------children of 't' keys---------------");
        
        Set<Character> keys3 = trie.root.children.get('t').children.keySet();
        for(Character key : keys3) {
        	System.out.println(key);
        }
        
        
        System.out.println("--------------is prefix valid method----------------");
        trie.isPrefixValid("tz");
        
        
        System.out.println("--------------is word valid method----------------");
        trie.isWordValid("car");
        
        
        System.out.println("--------------print all keys method----------------");
        trie.printAllKeys();
                
        
	}

}
