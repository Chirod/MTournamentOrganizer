/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tournamentorganizer;

/**
 *
 * @author Jessica &Christopher
 */
public class Player {
    private int matchPoints;
    private int gameWinsTiebreaker;
    private String Name;
    public Player(String name){
        matchPoints = 0;
        gameWinsTiebreaker = 0;
        Name = name;
    }
    public void addRecord(int GameWins,int GameLosses,int draws){
        if (GameWins>GameLosses){
            matchPoints=matchPoints+3;
        }
        gameWinsTiebreaker = GameWins +3;
    }
    public int getMatchPoints() {
        return matchPoints;
    }
    public double getTournamentScore(){
        return matchPoints+(.01*gameWinsTiebreaker);
    }
    public String getName() {
        return Name;
    }

    void setName(String text) {
        Name = text;
    }
    
}
