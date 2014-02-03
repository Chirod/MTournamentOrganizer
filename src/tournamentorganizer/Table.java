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
class Table {

    Player player1 = null;
    Player player2 = null;

    public Player getPlayer1() {
        return player1;
    }

    public boolean assignPlayer(Player myPlayer) {
        if (player1 == null) {
            player1 = myPlayer;
            player1.isAssigned = true;
            return true;
        } else if (player2 == null
                && TournamentOrganizer.havePlayed[player1.getPlayerNumber()][ myPlayer.getPlayerNumber()]
                && (!(player1 == myPlayer))) {
                    player2 = myPlayer;
                    player2.isAssigned = true;
            TournamentOrganizer.havePlayed[player1.getPlayerNumber()][player2.getPlayerNumber()] = true;
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        player1 = null;
        player2 = null;
    }
}
