import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 Scanner sn = new Scanner(System.in);
        int length = sn.nextInt();
        int num = sn.nextInt();
         BitSet b1 = new BitSet(length);
         BitSet b2 = new BitSet(length);
        while(num-->0){
             String command = sn.next();
            int firstNum = sn.nextInt();
            int secondNum = sn.nextInt();
            boolean firstNumIsOne=firstNum==1;
           
           if(firstNumIsOne){
               SetBitSets(b1,b2,secondNum,command);
           }
           else{
               SetBitSets(b2,b1,secondNum,command);
           }
        System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
            
    }
     public static void SetBitSets(BitSet firstB,BitSet lastB,int secondNum,String command){
             if(command.equals("AND")){
                firstB.and(lastB);
            }
            else if(command.equals("OR")){
                firstB.or(lastB);
            }
             else if(command.equals("XOR")){
                firstB.xor(lastB);
            }
             else if(command.equals("SET")){
                firstB.set(secondNum);
            }
             else if(command.equals("FLIP")){
            firstB.flip(secondNum);
            }
            
        }
}