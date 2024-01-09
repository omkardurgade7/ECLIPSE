package max_min_val_array;

public class test7 
{
   public static void main(String[] args) {
	
	   int a[]= {5,2,4,6,1,5};
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
