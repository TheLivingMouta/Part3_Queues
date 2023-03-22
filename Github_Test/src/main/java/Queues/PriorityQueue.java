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
public class PriorityQueue extends Queues {
    
    @Override
    public void enque(int value){
        if(first == null){
            throw new NoSuchElementException();
        }
        
        Node newNode = new Node(value);
        Node current = first.next;
        Node previous = first;
        for(int i = 0; i < size(); i++){
            if(last.data < newNode.data){
                newNode.next = last;
                last = newNode;
            } else if(first.data < newNode.data){
                newNode.next = first;
                first = newNode;
            } else {
                while(current.data < newNode.data){
                    previous = current;
                    current = current.next;
                }
                
                previous.next = newNode;
                newNode.next = current;
                
            }
        }
        
        size++;
        
    }

 
    
    
    
}
