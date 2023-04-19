import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		String regexHtmlQuery="<([^><]+)>([^><]+)</\\1>";
        Pattern htmlPattern=Pattern.compile(regexHtmlQuery);
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){
			String line = in.nextLine();        
			Matcher matcherHtml =htmlPattern.matcher(line);  
            if(matcherHtml.find()){
            matcherHtml.reset();
            while (matcherHtml.find()) {
                System.out.println(matcherHtml.group(2));
            }
            }
            else{
                System.out.println("None");
            }
		}
        in.close();
	}
}



