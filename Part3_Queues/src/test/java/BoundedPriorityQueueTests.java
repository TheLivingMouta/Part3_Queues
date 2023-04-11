/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Tasks.Task;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import utils.BoundedPriorityQueueSet;

/**
 *
 * @author carol
 */
public class BoundedPriorityQueueTests {
   
    @Test
    public void testSize_EmptyList() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    @Test
    public void testSize_PopulatedList() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task());
        instance.add(new Task());
        instance.add(new Task());
        int expResult = 3;
        int result = instance.size();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEmpty() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsEmpty_PopulatedList() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Temp title0", "Temp Artist0"));
        instance.add(new Task("Temp title1", "Temp Artist1"));
        instance.add(new Task("Temp Title", "Temp Artist"));
        
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsFull_EmptyQueue() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsFull() {
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet(1);
        LocalDate deadline = LocalDate.parse("2023-04-11");
        instance.add(new Task("Temp title0", "Temp Artist0",deadline));
        boolean expResult = true;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPeek(){
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet(1);
        LocalDate deadline = LocalDate.parse("2023-04-11");
        instance.add(new Task("Temp title0", "Temp Artist0",deadline));
        Task expResult = new Task("Temp title0", "Temp Artist0",deadline);
        Task result = instance.peek();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPeek_InvalidData(){
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet(1);
        LocalDate deadline = LocalDate.parse("2023-04-11");
        instance.add(new Task("Temp title0", "Temp Artist0",deadline));
        Task expResult = new Task("Temp title1", "Temp Artist1",deadline);
        Task result = instance.peek();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemove_RemovingSingleInstanceWhereMultipleExist() {
        LocalDate deadline = LocalDate.parse("2023-04-11");
        Task s = new Task("Temp title1", "Temp Artist1",deadline);
        BoundedPriorityQueueSet instance = new BoundedPriorityQueueSet();
        instance.add(new Task("Temp title0", "Temp Artist0",deadline));
        instance.add(new Task("Temp title1", "Temp Artist1",deadline));
        instance.add(new Task("Temp Title", "Temp Artist",deadline));
        instance.add(new Task("Temp title1", "Temp Artist1",deadline));
        
        boolean expResult = true;
        boolean result = instance.remove(s);
        assertEquals(expResult, result);
        int expSize = 3;
        assertEquals(expSize, instance.size());
        int expPos = 2;
        assertEquals(expPos, instance.indexOf(s));
    
    
}
