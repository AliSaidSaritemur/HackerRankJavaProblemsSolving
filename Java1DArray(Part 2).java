import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
      boolean oneNumStatue=(Arrays.stream(game).anyMatch(num -> num == 1));
       if(leap==0&&oneNumStatue )
        return false;
        else if(!oneNumStatue)
        return true;
          
        return canWinWithStartPosition(leap,game,0);
    }
 public static boolean canWinWithStartPosition(int leap, int[] game,int startPosition) {

    boolean result=false;
      if(startPosition+leap>=game.length){
          result=true;
          return result;        
      } 
          
    int[] firstGame = Arrays.copyOf(game, game.length);
    int[] secondGame =Arrays.copyOf(game, game.length);
    int[] thirdGame =Arrays.copyOf(game, game.length);
    
    
     if(game[startPosition+leap]==0)   
    {
         thirdGame[startPosition]=1;
        if( canWinWithStartPosition(leap,thirdGame,startPosition+leap))
          return true;
    } 
    else{}
      if(game[startPosition+1]==0){
         secondGame[startPosition]=1;
       if( canWinWithStartPosition(leap,secondGame,startPosition+1))
         return true;
    } 
    else{}
     if(startPosition!=0 &&game[startPosition-1]==0){
        firstGame[startPosition]=1;
        if(canWinWithStartPosition(leap,firstGame,startPosition-1))
        return true;
    }
  
   
    return result;    
 }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
