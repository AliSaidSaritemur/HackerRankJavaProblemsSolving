import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger firstInt = new BigInteger(in.next());
    BigInteger secondInt = new BigInteger(in.next());
    
    String sum=firstInt.add(secondInt).toString();
    String multi=firstInt.multiply(secondInt).toString();
    
    System.out.println(sum);
    System.out.println(multi);
    }
}
