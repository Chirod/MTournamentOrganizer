

package tournamentorganizer;


public class TournamentOrganizer {

    
    
    public static Player[] myPlayer = new Player[8];
    private static boolean[][] havePlayed = new boolean[8][8];
    
    public static void main(String[] args) {
        for(int i =0;i<=7;i++){
            myPlayer[i] = new Player("");
            RoundInterface.main();
        }
    }
    public static Table[] myTables = new Table[4];
    public static boolean havePlayed(int a, int b) {
        return havePlayed[a-1][b-1];
    }
    
}
