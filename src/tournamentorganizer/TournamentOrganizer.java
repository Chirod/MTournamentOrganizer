

package tournamentorganizer;


public class TournamentOrganizer {

    
    
    public static Player[] myPlayer = new Player[8];
    public static Player[] PlayerRanked = new Player[8];
    private static boolean[][] havePlayed = new boolean[8][8];
    public static Player Player;
    public static void main(String[] args) {
        for(int i =0;i<=7;i++){
            myPlayer[i] = new Player("");
        }
        //RoundInterface.main();
       PlayerRanked[1] = myPlayer[1];
       PlayerRanked[2] = myPlayer[2];
       myPlayer[2].addRecord(2,0,0);
       Player = PlayerRanked[1];
       
    }
    public static Table[] myTables = new Table[4];
    public static boolean havePlayed(int a, int b) {
        return havePlayed[a-1][b-1];
    }
    
    public void sortRankings(){
        PlayerRanked
        
    }
    
}
