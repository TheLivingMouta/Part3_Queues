/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queues;

/**
 *
 * @author carol
 */
public class BoundedQueue extends Queues{
    private static final int INITIAL_CAPACITY = 10;
    private final int maxCapacity;
    
    public BoundedQueue(){
        super();
        maxCapacity = INITIAL_CAPACITY;
    }
    
    public BoundedQueue(int value){
        super();
        if(value <= 0){
            throw new IllegalArgumentException();
        }
        maxCapacity = value;
    }
    
    @Override
    public void enque(int value){

         if(size() >= maxCapacity){
            throw new IllegalArgumentException();
         }
         
         enque(value);    
    }
    
    public boolean isFull(){
        if(size() < maxCapacity){
            return true;
        }
        return false;
    }
    
    //How to block methods from the Super class in a Sub-Class
    @Override
    public int peek(){
        throw new UnsupportedOperationException("Feature not implemented");
    }
    
}
