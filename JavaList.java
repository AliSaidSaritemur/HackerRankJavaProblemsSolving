import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class Solution {

    public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    
    int arraySize=sc.nextInt();
    List<Integer> nums = new ArrayList<>();
    while(arraySize-->0)
    nums.add(sc.nextInt());
    
      int commandAmount=sc.nextInt();
      while(commandAmount-->0){
        String commandName=sc.next();
          if(commandName.equals("Insert")){
              int index=sc.nextInt();
              int numToBeAdd=sc.nextInt();
              nums.add(index,numToBeAdd);
          }
          else if(commandName.equals("Delete")){
                int index=sc.nextInt();
                nums.remove(index);
          }       
      }
       System.out.println(nums.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));       
    }
}