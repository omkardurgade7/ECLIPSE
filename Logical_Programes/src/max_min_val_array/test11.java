package max_min_val_array;

public class test11 
{
   public static void main(String[] args) {
	
	   int a[]= {1,6,655,5,6,14,2,1,66,0};
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
