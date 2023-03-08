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
    final int maxCapacity;
    
    public BoundedStack(){
        maxCapacity = 10;
    }
    
    public BoundedStack(int value){
        if(value <= 0){
            throw new IllegalArgumentException();
        }
        maxCapacity = value;
    }
    
    public void push(String value){
        if(size() >= maxCapacity){
            throw new IllegalArgumentException();
        } 
        
        push(value);
        
    }
    
    public boolean isFull(){
        if(size() < maxCapacity){
            return true;
        }
        return false;
    }
}
