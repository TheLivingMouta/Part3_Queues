/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Tasks;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author carol
 */
public abstract class Task implements Comparable {

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
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.owner);
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.deadline);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Task other = (Task) obj;
        if (!Objects.equals(this.owner, other.owner)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return Objects.equals(this.deadline, other.deadline);
    }
    
    @Override
    public int compareTo(LocalDate o) {
        if(this.deadline.compareTo(o) > 0){
            return 1;
        } else if(this.deadline.compareTo(o) < 0){
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Task{" + "owner:" + owner +  "" + "description:" + description + "" + "deadline:" + deadline + '}';
    }
 
 
 
    
}
