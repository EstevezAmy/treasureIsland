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
public class Backpack implements Serializable {
    
    //Class instance Variables
    private double numGrandpaLetter;
    private double numGoldCoins;
    private double numShovel;
    private double mapFull;
    
    //Constructor Function 
    public Backpack() {
        
    }
    
    
    
    // Getter and Setter Functions
    public double getNumGrandpaLetter() {
        return numGrandpaLetter;
    }

    public void setNumGrandpaLetter(double numGrandpaLetter) {
        this.numGrandpaLetter = numGrandpaLetter;
    }

    public double getNumGoldCoins() {
        return numGoldCoins;
    }

    public void setNumGoldCoins(double numGoldCoins) {
        this.numGoldCoins = numGoldCoins;
    }

    public double getNumShovel() {
        return numShovel;
    }

    public void setNumShovel(double numShovel) {
        this.numShovel = numShovel;
    }

    public double getMapFull() {
        return mapFull;
    }

    public void setMapFull(double mapFull) {
        this.mapFull = mapFull;
    }
    
    //Source, Incert Code, toString
    @Override
    public String toString() {
        return "Backpack{" + "numGrandpaLetter=" + numGrandpaLetter + ", numGoldCoins=" + numGoldCoins + ", numShovel=" + numShovel + ", mapFull=" + mapFull + '}';
    }

    //HashCode and Equals
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numGrandpaLetter) ^ (Double.doubleToLongBits(this.numGrandpaLetter) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numGoldCoins) ^ (Double.doubleToLongBits(this.numGoldCoins) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.numShovel) ^ (Double.doubleToLongBits(this.numShovel) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.mapFull) ^ (Double.doubleToLongBits(this.mapFull) >>> 32));
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
        final Backpack other = (Backpack) obj;
        if (Double.doubleToLongBits(this.numGrandpaLetter) != Double.doubleToLongBits(other.numGrandpaLetter)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numGoldCoins) != Double.doubleToLongBits(other.numGoldCoins)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numShovel) != Double.doubleToLongBits(other.numShovel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.mapFull) != Double.doubleToLongBits(other.mapFull)) {
            return false;
        }
        return true;
    }
    
    
    
}
