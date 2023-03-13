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
        maxCapacity = INITIAL_CAPACITY;
    }
    
    public BoundedQueue(int value){
        if(value <= 0){
            throw new IllegalArgumentException();
        }
        maxCapacity = value;
    }
    
    public void enque(int value){

         if(size() >= maxCapacity){
            throw new IllegalArgumentException();
         }
         
         enque(value);
         
        
    }
    
}
