package p5;

public class palendrome {

	
	public static void main(String[]args)
	{
		int num=12345;
		int rev=0;
		
		int rem=0;
		
		int temp=num;
		
		while(num!=0)
		{
			
			rem=num%10;
			
			rev=rev*10+rem;
			
			num=num/10;
			
		}
		if(temp==rev)
		{
			
			System.out.println("number is palendrone");
		}
		
		else {
			
			System.out.println("Number is not palendrone");
		}
		
		
		
		
		
		
		
	}
}
