import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        String s = scan.nextLine().trim();
      
      if(s.length()==0){
            System.out.println(0);
           return;
      }
          
        String [] wordList= s.split("[^a-zA-Z]+");
        System.out.println(wordList.length);
          
        for(String word : wordList){
        System.out.println(word);
        }
        scan.close();
    }
}

