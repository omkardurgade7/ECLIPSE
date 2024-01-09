package Prime_Numbers;

public class test9 
{
 public static void main(String[] args) {
	
	 int number = 7;
	 
	 for(int i=2; i<number/2; i++)
	 {
		 if(number%2==0)
		 {
			 System.out.println("prime number");
		 }
		 
		 else
		 {
			 System.out.println("not prime number");
		 }
	 }
}
}
