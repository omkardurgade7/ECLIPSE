package Max_Array;

import java.util.Arrays;

public class Second_Highest_Number {

	
	   public static void main(String[] args) {
		
		   int []a= {2,3,1,3,4,5,6,60,40};
		   Arrays.sort(a);
		   int secondHighest=Arrays.stream(a).skip(7).findFirst().getAsInt();
		   System.out.println(secondHighest);
	}
}
