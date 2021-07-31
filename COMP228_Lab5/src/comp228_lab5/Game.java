/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp228_lab5;

/**
 *
 * @author faiaz
 */
public class Game {
    
    private String gameTitle;
    private int gameID;

    public int getGameID() {
        return gameID;
    }

    public Game(String gameTitle, int gameID) {
        this.gameTitle = gameTitle;
        this.gameID = gameID;
    }

    @Override
    public String toString() {
        return gameTitle;
    }
}
