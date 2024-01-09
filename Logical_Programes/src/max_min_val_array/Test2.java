package max_min_val_array;

public class Test2 {

	
	  public static void main(String[] args) {
		
		  int a[]= {6,2,56,4565,5365,221,0225};
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
