package Max_Array;

import java.lang.reflect.Array;

public class Test1 {

	   public static void main(String[] args)
	   {
		int a[]={2,3,1,3,4,5,6,60,40};
		int max=a[0];
		
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}	
		System.out.println("max value in array is "+max);	
	}
}
