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
public class HelpParrott implements Serializable {
    
    
    // Class Instance Variables
    private String newHint;
    private String previousHints;
    
    //Constructor Function
    public HelpParrott() {
    }
    
    
    //Getter and Setter Functions
    public String getNewHint() {
        return newHint;
    }

    public void setNewHint(String newHint) {
        this.newHint = newHint;
    }

    public String getPreviousHints() {
        return previousHints;
    }

    public void setPreviousHints(String previousHints) {
        this.previousHints = previousHints;
    }
    
    //toString, equals(), hashCode

    @Override
    public String toString() {
        return "HelpParrott{" + "newHint=" + newHint + ", previousHints=" + previousHints + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.newHint);
        hash = 37 * hash + Objects.hashCode(this.previousHints);
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
        final HelpParrott other = (HelpParrott) obj;
        if (!Objects.equals(this.newHint, other.newHint)) {
            return false;
        }
        if (!Objects.equals(this.previousHints, other.previousHints)) {
            return false;
        }
        return true;
    }
    
    
}
