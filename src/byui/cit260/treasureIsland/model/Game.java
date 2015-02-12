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
public class Game implements Serializable{
    
    // Class Instance Variables
    private String newGame;
    private String previousGames;
    private String currentGame;
    private String quitGame;
    private String saveGame;
    
    //Constructor Function
    public Game() {
    }
    
    
    //Getter and Setter Functions
    public String getNewGame() {
        return newGame;
    }

    public void setNewGame(String newGame) {
        this.newGame = newGame;
    }

    public String getPreviousGames() {
        return previousGames;
    }

    public void setPreviousGames(String previousGames) {
        this.previousGames = previousGames;
    }

    public String getCurrentGame() {
        return currentGame;
    }

    public void setCurrentGame(String currentGame) {
        this.currentGame = currentGame;
    }

    public String getQuitGame() {
        return quitGame;
    }

    public void setQuitGame(String quitGame) {
        this.quitGame = quitGame;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }
    
    //toString, equals, hashCode

    @Override
    public String toString() {
        return "Game{" + "newGame=" + newGame + ", previousGames=" + previousGames + ", currentGame=" + currentGame + ", quitGame=" + quitGame + ", saveGame=" + saveGame + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.newGame);
        hash = 29 * hash + Objects.hashCode(this.previousGames);
        hash = 29 * hash + Objects.hashCode(this.currentGame);
        hash = 29 * hash + Objects.hashCode(this.quitGame);
        hash = 29 * hash + Objects.hashCode(this.saveGame);
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
        final Game other = (Game) obj;
        if (!Objects.equals(this.newGame, other.newGame)) {
            return false;
        }
        if (!Objects.equals(this.previousGames, other.previousGames)) {
            return false;
        }
        if (!Objects.equals(this.currentGame, other.currentGame)) {
            return false;
        }
        if (!Objects.equals(this.quitGame, other.quitGame)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        return true;
    }
    
    
   
    
}
