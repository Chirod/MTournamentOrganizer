

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
        
        RoundInterface.main();
             
    }
    public static Table[] myTables = new Table[4];
   
    public void 
    
    public void sortRankings(){
        for (int i = 0; i<8;i++){
            for (int a = 0; a<8; a++){
                if (PlayerRanked[a].getMatchPoints()<PlayerRanked[a+1].getMatchPoints()) {
                    swap(a,a+1);
                }
            }
        }
    }
    public void swap(int a, int b){
        PlaceHolderPlayer = PlayerRanked[a];
        PlayerRanked[a] = PlayerRanked[b];
        PlayerRanked[b] = PlaceHolderPlayer;
    
    }
    
    public void sortPairings() {
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
    
}
