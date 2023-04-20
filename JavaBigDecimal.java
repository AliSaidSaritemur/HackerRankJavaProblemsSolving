import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
ArrayList<String> numsToBeSort=new  ArrayList<String>();
for(int i=0;i<n;i++){
    numsToBeSort.add(s[i]);
}

for(int i =0;i<n;i++){
    String maxFlautStr="";
    BigDecimal maxBigDecimal = new BigDecimal("-1E+2147483647");
    for(int j =0;j<numsToBeSort.size();j++){
        String currentValueStr=numsToBeSort.get(j);
       BigDecimal currentBigDecimal = new BigDecimal(currentValueStr);
        if(maxBigDecimal.compareTo(currentBigDecimal)<0){
            maxFlautStr=currentValueStr;
            maxBigDecimal=currentBigDecimal;
        }
    }
    s[i]=maxFlautStr; 
    numsToBeSort.remove(maxFlautStr); 
  
}
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}