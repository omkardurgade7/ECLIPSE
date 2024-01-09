package max_min_val_array;

public class test15 
{
   public static void main(String[] args) {
	
	   
	   int a[]= {1,5,6,2,3,4,7,8,9,55};
	   int max=a[0];
	   
	   for(int i=1; i<a.length; i++)
	   {
		   
		   if(a[i]>max)
		   {
			   max=a[i];
		   }
	   }
	   System.out.println(max);
}
}
