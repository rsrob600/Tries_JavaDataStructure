package com.codingdojo.tries;

import java.util.HashSet;
import java.util.Set;

public class Trie {
	
public final Node root;


   

    public Trie() {
        this.root = new Node();

    }
    
    
    
    
    
    
    public void insertWord(String word) {
        // gets the root node;
        Node currentNode = this.root;
        
        // iterates over every character in the word
        for(int i = 0; i < word.length(); i++) {
            // currentLetter is just the character / letter at the iteration
            Character currentLetter = word.charAt(i);
            // ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            // if child node not found
            if(child == null) {
            	// create a new node
                child = new Node();
                // add character to new child node created
                currentNode.children.put(currentLetter, child); 
            } 
            // move to next node
            currentNode = child;
        }
        // add end of word marker to complete the word
        currentNode.isCompleteWord = true;
    }
    
    
    // boolean isPrefixValid(String prefix): Returns a boolean whether the prefix is in the trie or not.
    public boolean isPrefixValid(String prefix) {
    	
    	// gets the root node;
        Node currentNode = this.root;
        // iterates over every character in the prefix
        for (int i = 0; i < prefix.length(); i++) {
        	// ch is just the characters / letter at the iteration 
            char ch = prefix.charAt(i);
            // ask if the current character is in the map of the current node
            Node node = currentNode.children.get(ch);
            // if nothing is found
            if (node == null) {
            	System.out.println("match not found for: " + prefix);
                return false;
            }
            // move to next node
            currentNode = node;
        }
        System.out.println("match found for: " + prefix);
        return true;
    	
    }

    
    // boolean isWordValid(String word): Returns a boolean whether the word is in the trie or not.    
    public boolean isWordValid(String word) {
    	
    	// gets the root node;
        Node currentNode = this.root;
        // currentLetter is just the character / letter at the iteration 
        for (int i = 0; i < word.length(); i++) {
        	// current letter is just the character / letter at the iteration
        	Character currentLetter = word.charAt(i);
        	// ask if the current letter is in the map of the current node
            Node child = currentNode.children.get(currentLetter);
            // child node not found
            if (child == null) {
            	System.out.println("match not found for: " + word);
                return false;
            }
            // move to next node
            currentNode = child;
        }
        System.out.println("match found for: " + word);
        return true;

    }
    
    
    

    
    
    

	
	
    
    // void printAllKeys(): This method prints all the characters in your trie.
    public void printAllKeys() {
    	
    	Node currentNode = this.root;
        
        for (Character ch : currentNode.children.keySet()) {
        	System.out.println("key: " + ch); 
        	System.out.println(this.root.children.get(ch).children.keySet());
        	//currentNode = next;
        }
    }
    
    

    
     

}
