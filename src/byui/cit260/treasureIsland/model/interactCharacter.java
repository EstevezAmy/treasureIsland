/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy
 */
public class interactCharacter implements Serializable{
    
    // Class Instance Variables
    private String name;
    private String message;
    
    
    // Constructor Function
    public interactCharacter() {
    }
    
    
    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    //toString equals hashCode

    @Override
    public String toString() {
        return "interactCharacter{" + "name=" + name + ", message=" + message + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.message);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final interactCharacter other = (interactCharacter) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.message, other.message)) {
            return false;
        }
        return true;
    }
    
    
    
}
