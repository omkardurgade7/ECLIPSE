package max_min_val_array;

public class test12 
{
   public static void main(String[] args) {
	
	   int a[]= {1,6,5,5,6,4,8,1,23,2};
	   
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
