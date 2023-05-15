import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static List<List<Integer>> numsList =new ArrayList<>();
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int counter=0;
    int n=sc.nextInt();
           
           while(n-->0){
               int d=sc.nextInt();
               numsList.add(new ArrayList<Integer>());
               while(d-->0){
                   numsList.get(counter).add(sc.nextInt());
               }
                   counter++;
           }
          
            int q=sc.nextInt();
            while(q-->0){
                
                int x =sc.nextInt()-1;
                int y=sc.nextInt()-1;
                
                String output;
                if(numsList.size()<=x||numsList.get(x).size()<=y)
                output="ERROR!";
                else{
                  output =numsList.get(x).get(y).toString();
                }
                System.out.println(output);
            }
    }              
}