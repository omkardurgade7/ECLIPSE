package max_min_val_array;

public class test9 
{
   public static void main(String[] args) {
	
	   int a[]= {46,62,5,16,81,6,816,916,516,65};
	   int min=a[0];
	   
	   for(int i=1; i<a.length; i++)
	   {
		   if(a[i]<min)
		   {
			   min=a[i];
		   }
	   }
	   System.out.println(min);
}
}
