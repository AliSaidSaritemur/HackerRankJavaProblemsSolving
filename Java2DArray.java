import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        int maxHourglassSum=Integer.MIN_VALUE;
        int tempHourglassSum=Integer.MIN_VALUE;
        for(int i =0 ;i<arr.size();i++){
            
            if(i>=arr.size()-2)
            break;
            
            for(int j=0;j<arr.get(0).size();j++){
                 if(j>=arr.get(0).size()-2)
                    break;
                
     tempHourglassSum=getAfterThreeNumSum(arr,i,j)+arr.get(i+1).get(j+1)+getAfterThreeNumSum(arr,i+2,j);
                maxHourglassSum=tempHourglassSum>maxHourglassSum?tempHourglassSum:maxHourglassSum;
                
                
            }
        }
        
        System.out.println(maxHourglassSum);
                         
    }
    
   
     public static int getAfterThreeNumSum(List<List<Integer>> arr,int y,int x){
        
        return  arr.get(y).get(x)+arr.get(y).get(x+1)+arr.get(y).get(x+2);
    }
    
}
