/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Tasks;

import java.time.LocalDate;

/**
 *
 * @author carol
 */
public class Task {

 private String owner;
 private String description;
 private LocalDate deadline;

    public Task(String owner, String description, LocalDate deadline) {
        this.owner = owner;
        this.description = description;
        if(deadline.compareTo(LocalDate.now()) != 0){
        this.deadline = deadline;
        }
    }
 
 
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        if(deadline.compareTo(LocalDate.now()) != 0){
            this.deadline = deadline;
        }
    }

    @Override
    public String toString() {
        return "Task{" + "owner:" + owner +  "" + "description:" + description + "" + "deadline:" + deadline + '}';
    }
 
 
 
    
}
