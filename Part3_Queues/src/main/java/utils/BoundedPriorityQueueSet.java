/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import Tasks.Task;
import java.util.NoSuchElementException;

/**
 *
 * @author carol
 */
public class BoundedPriorityQueueSet {
    private Node first;
    private Node last;
    private static final int INITIAL_CAPACITY = 10;
    private final int maxCapacity;
    private int size;
    
    public BoundedPriorityQueueSet(){
        super();
        maxCapacity = INITIAL_CAPACITY;
    }
    
    public BoundedPriorityQueueSet(int value){
        super();
        if(value <= 0){
            throw new IllegalArgumentException();
        }
        maxCapacity = value;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public boolean isFull(){
        return size == maxCapacity;
    }
    
    public int add(Task value){
        Node newNode = new Node(value);
        Node current = first.next;
        Node previous = first;
        
        if(isFull() == true){
            throw new IllegalStateException();
        }
        
        if(){
            throw new DuplicateElementException();
        }
        
        for(int i = 0; i < size(); i++){
            if(last.data.compareTo(newNode.data) < 0){
                newNode.next = last;
                last = newNode;
            } else if(first.data.compareTo(newNode.data) < 0){
                newNode.next = first;
                first = newNode;
            } else {
                while(current.data.compareTo(newNode.data) < 0){
                    previous = current;
                    current = current.next;
                }
                
                previous.next = newNode;
                newNode.next = current;
                
            }
        }
        
        size++;
    }
    
    public Task peek(){
        return first.data;
    }
    
    public Task removew(){
        
        if(first == null){
            throw new NoSuchElementException();
        }
        
        Task temp;
        temp = first.data;
        first = first.next;
        size--;
        
        return temp;
    }
    
    private static class Node {

        private Task data;
        private Node next;

        public Node(Task value) {
            this.data = value;
        }
        
        public boolean hasNext(){
            return next == null;
        }

    }
    
}
