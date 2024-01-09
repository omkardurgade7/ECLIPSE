package max_min_val_array;

public class test16 
{
   public static void main(String[] args) {
	
	   int a[]= {4,5,5,8,9,3,1,0};
	   int min=a[0];
	   
	   for(int i=1; i<a.length;  i++)
	   {
		   
		  if(a[i]<min) 
		  {
			  min=a[i];
		  }
		   
	   }
	   System.out.println(min);
	   
}
}
