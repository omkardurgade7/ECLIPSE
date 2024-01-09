package Prime_Numbers;

public class Test2 {

	
	 public static void main(String[] args) {
		
		 int num=24;
		 
		 for(int i=2; i<=num/2; i++)
		 {
			 if(num%i==2)
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
