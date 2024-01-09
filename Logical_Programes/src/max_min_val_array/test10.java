package max_min_val_array;

public class test10 {

	  public static void main(String[] args) {
		
		  int a[]= {1,5,1,2,51,5,5,65};
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
