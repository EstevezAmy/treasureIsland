/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasureIsland.model;

import java.io.Serializable;

/**
 *
 * @author Amy
 */
public class Items implements Serializable{
    
    // Class instance Variables
    private double numItemLimit;
    
    // Constructor Function
    public Items() {
    } 
    
    //Getter and Setter Functions
    public double getNumItemLimit() {
        return numItemLimit;
    }

    public void setNumItemLimit(double numItemLimit) {
        this.numItemLimit = numItemLimit;
    }
    
    //toString, equals, hashCode

    @Override
    public String toString() {
        return "Items{" + "numItemLimit=" + numItemLimit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numItemLimit) ^ (Double.doubleToLongBits(this.numItemLimit) >>> 32));
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
        final Items other = (Items) obj;
        if (Double.doubleToLongBits(this.numItemLimit) != Double.doubleToLongBits(other.numItemLimit)) {
            return false;
        }
        return true;
    }
    
    
    
}
