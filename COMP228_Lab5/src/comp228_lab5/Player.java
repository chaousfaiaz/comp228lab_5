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
public class Player {
    
    private String playerName;
    private int playerID;

    public int getPlayerID() {
        return playerID;
    }

    public Player(String playerName, int playerID) {
        this.playerName = playerName;
        this.playerID = playerID;
    }

    @Override
    public String toString() {
        return playerName;
    }
}
