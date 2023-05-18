import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
          boolean bracketStatue=bracketsChecker(input,'(',')');
          boolean curlyBracketStatue=bracketsChecker(input,'{','}');                        boolean squareBracketStatue=bracketsChecker(input,'[',']');
          boolean totalBracketStatue=(squareBracketStatue&&curlyBracketStatue&&bracketStatue);
          System.out.println(totalBracketStatue);
		}      
	}
    
    public static boolean bracketsChecker(String query,char openBracket,char closeBracket){
        int openBracketCount=0;
       for(char letter:query.toCharArray()){
           if(openBracket==letter)
           openBracketCount++;
           else if(letter==closeBracket){
               if(openBracketCount<=0)
               return false;
                openBracketCount--;
           }                  
       }
       return openBracketCount==0;
    }
}



