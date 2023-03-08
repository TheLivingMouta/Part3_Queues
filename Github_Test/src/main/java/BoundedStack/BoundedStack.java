/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BoundedStack;

import java.util.Stack;

/**
 *
 * @author carol
 */
public class BoundedStack extends Stack{
    private static final int initialCapacity = 10;
    private int capacity;
    
    public BoundedStack(){
        capacity = initialCapacity;
    }
    
    public BoundedStack(int value){
        if(value <= 0){
            throw new IllegalArgumentException();
        }
        capacity = value;
    }
    
    public void push(String value){
        if(isFull()){
            throw new IllegalArgumentException();
        } 
        
        push(value);
        
    }
    
    public boolean isFull(){
        if(size() < capacity){
            return true;
        }
        return false;
    }
}
