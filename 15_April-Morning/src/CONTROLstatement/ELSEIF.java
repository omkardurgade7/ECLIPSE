package CONTROLstatement;

public class ELSEIF {

	
	public static void main(String[] args) {
		
		int marks=66;
		
		if(marks>=60)
		{
			System.out.println("distinction");
		}
		else if(marks>=65)
		{
			System.out.println("First class");
		}
		else if(marks>=50)
		{
			System.out.println("second class");
		}
		else if(marks>=35)
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("fail");
		}
	}
}
