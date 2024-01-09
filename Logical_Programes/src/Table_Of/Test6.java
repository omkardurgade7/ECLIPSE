package Table_Of;

import java.util.Arrays;

public class Test6 {

	
	public static void main(String args[]) 
	{
       String x="silent";
	   String y="listen";
	   
	   char[] x1=x.toCharArray();
	   char[] y1=x.toCharArray();
	   
	   Arrays.sort(x1);
	   Arrays.sort(y1);
	   
	   if(String.valueOf(x1).equals(String.valueOf(y1)))
	   {
		   System.out.println("Given String is anagram");
	   }
	   else
	   {
		   System.out.println("Given String is not anagram");
	   }   
	   
}
}