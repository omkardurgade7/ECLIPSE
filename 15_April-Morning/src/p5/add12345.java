package p5;

public class add12345 {

	
	public static void main(String[]args)
	{
	int num=12345;
	int rem=0;
	int temp=num;
	int rev=0;
	while(num!=0)
	{
		
		rem=num%10;
		rev=rev+rem;
		
		num=num/10;
		
	}	
	System.out.println(rev);
	
		
		
	}
}
