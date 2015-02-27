/*
 * Treasure Island - Model Layer - Player
 */
package byui.cit260.treasureIsland.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Amy/ Indira
 */
public class Player implements Serializable{
    
    // Class Instance Variables
    private String name;
    private double currentScore;
    private double bestScore;
    Backpack backpack = new Backpack();
    
    // Constructor Function
    public Player() {
    }
    
    
    //Getter and Setter Functions
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(double currentScore) {
        this.currentScore = currentScore;
    }

    public double getBestScore() {
        return bestScore;
    }

    public void setBestScore(double bestScore) {
        this.bestScore = bestScore;
    }
    
    //toString equals hashCode

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", currentScore=" + currentScore + ", bestScore=" + bestScore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.currentScore) ^ (Double.doubleToLongBits(this.currentScore) >>> 32));
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.bestScore) ^ (Double.doubleToLongBits(this.bestScore) >>> 32));
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentScore) != Double.doubleToLongBits(other.currentScore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.bestScore) != Double.doubleToLongBits(other.bestScore)) {
            return false;
        }
        return true;
    }
    
    
}
