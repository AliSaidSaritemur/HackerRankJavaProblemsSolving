import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String,Integer> phoneBook=new HashMap<>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            phoneBook.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            String message;
            try{
            int userPhone=phoneBook.get(s);
            message=s+"="+userPhone;
            }
            catch(NullPointerException err){
               message= "Not found";
            }
            System.out.println(message);
		}
	}
}



