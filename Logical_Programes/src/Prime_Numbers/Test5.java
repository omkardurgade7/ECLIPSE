package Prime_Numbers;

public class Test5 {

	  public static void main(String[] args) {
		
		  int num=67;
		  for(int i=2; i<=num/2; i++)
		  {
			  if(num%2==0)
			  {
				  System.out.println("prime");
			  }
			  else
			  {
				  System.out.println("not prime");
			  }
		  }
	}
}
