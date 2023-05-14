import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
 int arraySize =sc.nextInt();
List<Integer> nums=new ArrayList();

while(arraySize-->0){
    
     nums.add(sc.nextInt());
}
int negativeSubarraysCount=0;
for(int i=0;i<nums.size();i++){
    int tempSum=0;
    for(int j =i;j<nums.size();j++){
        
        tempSum+=nums.get(j);
        if(tempSum<0)
        negativeSubarraysCount++;
    }  
}

System.out.print(negativeSubarraysCount);

    }
}