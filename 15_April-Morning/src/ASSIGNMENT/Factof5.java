package ASSIGNMENT;

public class Factof5 {

	//factorial of 5s
	public static void main(String[] args) {
		int i,
		factorial=1;
		
		int a=5;
		
		for(i=1; i<=a; i++)
		{
			
			factorial*=i;
		}
		
		System.out.println(factorial);
	}
}
