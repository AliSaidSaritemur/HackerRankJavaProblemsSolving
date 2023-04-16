import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){
			String pattern = in.nextLine();
            String output="";
               try{
                  Pattern.compile(pattern);                      
                   output="Valid";
              }
              catch(PatternSyntaxException e){
               output="Invalid";
              }
              System.out.println(output);
		}
        in.close();
	}
}
