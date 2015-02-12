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
public class Map implements Serializable{
    
    // Class Instance Variables
    private double numLocationsInMap;
    private String currentPlaceOnMap;
    
    //Constructor Function
    public Map() {
    }
    
    
    //Getter and Setter Functions
    public double getNumLocationsInMap() {
        return numLocationsInMap;
    }

    public void setNumLocationsInMap(double numLocationsInMap) {
        this.numLocationsInMap = numLocationsInMap;
    }

    public String getCurrentPlaceOnMap() {
        return currentPlaceOnMap;
    }

    public void setCurrentPlaceOnMap(String currentPlaceOnMap) {
        this.currentPlaceOnMap = currentPlaceOnMap;
    }
    
    //toString, equals, hashCode

    @Override
    public String toString() {
        return "Map{" + "numLocationsInMap=" + numLocationsInMap + ", currentPlaceOnMap=" + currentPlaceOnMap + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.numLocationsInMap) ^ (Double.doubleToLongBits(this.numLocationsInMap) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.currentPlaceOnMap);
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.numLocationsInMap) != Double.doubleToLongBits(other.numLocationsInMap)) {
            return false;
        }
        if (!Objects.equals(this.currentPlaceOnMap, other.currentPlaceOnMap)) {
            return false;
        }
        return true;
    }
    
    
    
}
