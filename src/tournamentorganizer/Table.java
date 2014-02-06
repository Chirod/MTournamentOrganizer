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
    Player WorthLessPlayer = new Player("worthless",0);
    Player player1 = WorthLessPlayer;
    Player player2 = WorthLessPlayer;

    public Player getPlayer1() {
        return player1;
    }

    public boolean assignPlayer(Player myPlayer) {
        if (player1 == null) {
            player1 = myPlayer;
            player1.isAssigned = true;
            return true;
        } else if (player2 == WorthLessPlayer
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
        System.out.println("clearing players in table");
        player1 = WorthLessPlayer;
        player2 = WorthLessPlayer;
    }
}
