package com.codingdojo.tries;

import java.util.HashMap;
public class Node {
	
	// 
	public HashMap<Character, Node> children;
    public boolean isCompleteWord;
    
    
    public Node() {
        this.children = new HashMap<Character, Node>();
        this.isCompleteWord = false;
    }
	

    public HashMap<Character, Node> getChildren() {
    	return children;
    }
    
    public HashMap<Character, Node> getChildren(Character prefix) {
    	return children;
    }
    
    public HashMap<Character, Node> getChild(int asciiIndex) {
    	return children;
    }

    
    public boolean isEnd() {
    	return isCompleteWord;
    }
    
}
