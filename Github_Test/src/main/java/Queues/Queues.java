/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queues;

import java.util.NoSuchElementException;

/**
 *
 * @author carol
 */
public class Queues {
    protected Node first;
    protected Node last;
    protected int size;
    
    public int size(){
        return size;
    }
    
    public void enque(int value){
        Node newNode = new Node(value);
             
        last.next = newNode;
        last = newNode;
        
        size++;
    }
    
    public void deque(){
        
        if(first == null){
            throw new NoSuchElementException();
        }
        
        int temp;
        temp = first.data;
        first = first.next;
        size--;
    }
    
    public int element(){
        
        if(first == null){
            throw new NoSuchElementException();
        }
        
        return first.data;
    }
    
    public int poll(){
        if(first == null){
            return -1;
        }
        int temp;
        temp = first.data;
        first = first.next;
        size--;
        return temp;
    }

    public int peek(){
        return first.data;
    }

    
     protected static class Node {

        protected int data;
        protected Node next;

        public Node(int value) {
            this.data = value;
        }
        
        public boolean hasNext(){
            return next == null;
        }

    }
    
}
