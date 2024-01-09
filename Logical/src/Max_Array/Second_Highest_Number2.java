package Max_Array;

import java.util.Arrays;

public class Second_Highest_Number2 {

	  public static void main(String[] args) 
	  {	
		  int a[]={2,3,1,3,4,5,6,60,40}; 
	      int n = a.length;
	      Arrays.sort(a);
	      System.out.println("Second Highest Number: "+a[n-2]);
	  }
}
