package max_min_val_array;

public class Test8 
{
   public static void main(String[] args) {
	
	   int a[]= {412,1554,452,12,5445,54254};
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
