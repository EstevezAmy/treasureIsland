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
public class LocationScene implements Serializable{
    
    // Class Instance Variables
    private String locationName;
    private double numScenesInLocation;
    private double numItemsInLocation;
    private String sceneOneName;
    private String sceneTwoName;
    
    //Constructor Function
    public LocationScene() {
    }
    
    
    //Getter and Setter Functions
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getNumScenesInLocation() {
        return numScenesInLocation;
    }

    public void setNumScenesInLocation(double numScenesInLocation) {
        this.numScenesInLocation = numScenesInLocation;
    }

    public double getNumItemsInLocation() {
        return numItemsInLocation;
    }

    public void setNumItemsInLocation(double numItemsInLocation) {
        this.numItemsInLocation = numItemsInLocation;
    }

    public String getSceneOneName() {
        return sceneOneName;
    }

    public void setSceneOneName(String sceneOneName) {
        this.sceneOneName = sceneOneName;
    }

    public String getSceneTwoName() {
        return sceneTwoName;
    }

    public void setSceneTwoName(String sceneTwoName) {
        this.sceneTwoName = sceneTwoName;
    }
    
    //toString, equals, hashCode

    @Override
    public String toString() {
        return "LocationScene{" + "locationName=" + locationName + ", numScenesInLocation=" + numScenesInLocation + ", numItemsInLocation=" + numItemsInLocation + ", sceneOneName=" + sceneOneName + ", sceneTwoName=" + sceneTwoName + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.locationName);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numScenesInLocation) ^ (Double.doubleToLongBits(this.numScenesInLocation) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.numItemsInLocation) ^ (Double.doubleToLongBits(this.numItemsInLocation) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.sceneOneName);
        hash = 23 * hash + Objects.hashCode(this.sceneTwoName);
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
        final LocationScene other = (LocationScene) obj;
        if (!Objects.equals(this.locationName, other.locationName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numScenesInLocation) != Double.doubleToLongBits(other.numScenesInLocation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numItemsInLocation) != Double.doubleToLongBits(other.numItemsInLocation)) {
            return false;
        }
        if (!Objects.equals(this.sceneOneName, other.sceneOneName)) {
            return false;
        }
        if (!Objects.equals(this.sceneTwoName, other.sceneTwoName)) {
            return false;
        }
        return true;
    }
    
    
    
}
