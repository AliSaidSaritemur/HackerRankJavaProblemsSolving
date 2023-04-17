import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
Pattern pIp=Pattern.compile("((?:(2(?:5[0-5])||[0-4][0-9])|([01][0-9][0-9])|([0-9][0-9])|([1-9]))\\.){2}(?:(2(?:5[0-5])||[0-4][0-9])|([01][0-9][0-9])|([0-9][0-9])|([1-9]))");

  Scanner in = new Scanner(System.in);
        while(in.hasNext()){
                  String IP = in.next();
            System.out.println(IP.matches("((?:(2((?:5[0-5])|([0-4][0-9])))|([01][0-9][0-9])|([0-9][0-9])|([0-9]))\\.){3}(?:(2((?:5[0-5])|([0-4][0-9])))|([01][0-9][0-9])|([0-9][0-9])|([0-9]))"));
        }
in.close();
    }
}