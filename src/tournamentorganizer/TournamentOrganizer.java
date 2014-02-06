

package tournamentorganizer;


public class TournamentOrganizer {

    
    
    public static Player[] myPlayer = new Player[8];
    public static Player[] PlayerRanked = new Player[8];
    public static boolean[][] havePlayed = new boolean[8][8];
    public static Player PlaceHolderPlayer;
    public static void main(String[] args) {
        for(int i =0;i<=7;i++){
            myPlayer[i] = new Player("",i);
            PlayerRanked[i] = myPlayer[i];
        }
        System.out.println("Players in tournament organizer created");
        for(int b = 0; b<8;b++){
         
            for(int c = 0; c<8;c++){
            
                havePlayed[b][c] = false;
                
            }
            
        }
        
        System.out.println("Have played var's created, starting primary interface");
        for(int a = 0; a<4; a++){
            myTables[a] = new Table();
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
        System.out.println("finished sorting rankings");
        sortPairings();
        System.out.println("finished sorting pairings");
        System.out.println("finished  configuring pairings");
    }
    
    public static void sortRankings(){
        for (int i = 0; i<8;i++){
            for (int a = 0; a<7; a++){
                if (PlayerRanked[a].getMatchPoints()<PlayerRanked[(a+1)].getMatchPoints()) {
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
      boolean succesfullyAssigned;
        for(int i =0;i<8;i++){
            if (!PlayerRanked[i].isAssigned){
                succesfullyAssigned = false;
                for(int b = 0; !succesfullyAssigned && b < 4; b++){
                    if (b==4) System.out.print("b is equal to 4");
                    
                    System.out.println("attempting to assign player "+i+" to table "+b);
                    succesfullyAssigned = myTables[b].assignPlayer(PlayerRanked[i]);
                    if (succesfullyAssigned) System.out.println("succesfully assigned player" + PlayerRanked[i].getPlayerNumber());
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
