package Reverse_Array;

public class Test7 {

	   public static void main(String[] args) {
		
		   int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		   
		   for(int i=1; i<a.length; i++)
		   {
			   if(a[i]%2==0)
			   {
				   System.out.println(a[i]);
			   }
		   }
	}
}
