/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

import java.util.EmptyStackException;

/**
 *
 * @author carol
 */
public class Stack {
    protected Node first;
    protected int count;
    
    public Stack(){
        first = null;
        count = 0;
    }
    
    public int count(){
        return count;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public String peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return first.data;
    }
    
    public void push(String value){
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;
        count++;
    }
    
    public String pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        
        String temp;
        temp = first.data;
        first = first.next;
        count--;
        
        return "The data that was removed was " + temp;
    }
    
    
    
    protected static class Node {

        protected String data;
        protected Node next;

        public Node(String value) {
            this.data = value;
        }
        
        public boolean hasNext(){
            return next == null;
        }

    }
}
