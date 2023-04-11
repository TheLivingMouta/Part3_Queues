/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import Tasks.Task;

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
        
    }
    
    private static class Node {

        private int data;
        private Node next;

        public Node(int value) {
            this.data = value;
        }
        
        public boolean hasNext(){
            return next == null;
        }

    }
    
}
