package Exception_Handling;

public class Exception_Handled1 {

	
	   public static void main(String[] args) {
		
		   int a=10;
		   int b=1;
		   
		   int c;
		   
		   try 
		   {
			   c=a/b;
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println("Arithmetic Exception Handled");
			   c=a/1;
		   }
		   System.out.println("hello");
	}
}
