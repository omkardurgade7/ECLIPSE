package max_min_val_array;

public class test13 
{

	  public static void main(String[] args) {
		
		  int a[]= {5,6,5,5,6,8,6,1,2};
		  
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
