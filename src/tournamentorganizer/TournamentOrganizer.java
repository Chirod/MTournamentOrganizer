

package tournamentorganizer;


public class TournamentOrganizer {

    
    
    public static Player[] myPlayer = new Player[8];
    public static Player[] PlayerRanked = new Player[8];
    public static boolean[][] havePlayed = new boolean[8][8];
    public static Player PlaceHolderPlayer;
    public static void main(String[] args) {
        for(int i =0;i<=7;i++){
            myPlayer[i] = new Player("",0);
            PlayerRanked[i] = myPlayer[i];
        }
        System.out.println("Players in tournament organizer created");
        for(boolean[] array:havePlayed){
            for(boolean var: array){
                var = false;
            }
            
        }
        
        System.out.println("Have played var's created, starting primary interface");
        for(Table currentTable : myTables){
            currentTable = new Table();
        }
        System.out.println("tables created");
        RoundInterface.main();
             
    }
    public static Table[] myTables = new Table[4];
   
    public static void configurePairings() {
        System.out.println("starting to configure pairings");
        clearPlayersFromTables();
        System.out.println("finished clearing players");
        sortRankings();
        sortPairings();
    }
    
    public static void sortRankings(){
        for (int i = 0; i<8;i++){
            for (int a = 0; a<8; a++){
                if (PlayerRanked[a].getMatchPoints()<PlayerRanked[a+1].getMatchPoints()) {
                    swap(a,a+1);
                }
            }
        }
    }
    public static void swap(int a, int b){
        PlaceHolderPlayer = PlayerRanked[a];
        PlayerRanked[a] = PlayerRanked[b];
        PlayerRanked[b] = PlaceHolderPlayer;
    
    }
    
    public static void sortPairings() {
        sortRankings();
      boolean a;
        for(int i =0;i<8;i++){
            if (!PlayerRanked[i].isAssigned){
                a = false;
                for(int b = 0; !a; b++){
                    a = myTables[b].assignPlayer(PlayerRanked[i]);
                }
            }
      
        }     
    }
    public static void clearPlayersFromTables() {
        System.out.println(" stared clearing players:");
        for(int i = 0; i<8; i++){
             myPlayer[i].isAssigned = false;
             System.out.println("player" + i + "cleared");
            
        }
        
        for(int a = 0; a<4; a++){
            myTables[a].clear();
        }
    }
    
}
