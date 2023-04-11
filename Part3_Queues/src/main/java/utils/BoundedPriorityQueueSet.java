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
    private static final int INITIAL_CAPACITY = 10;
    private final int maxCapacity;
    
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
}
