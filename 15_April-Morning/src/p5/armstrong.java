package p5;

public class armstrong {

	
	public static void main(String[] args) {
		
		int num=153;
		
		int rem=0;
		
		int rev=0;
		
		int temp=num;
		

		while(num!=0)
		{
			rem=num%10;
			
			rev=rev+(rem*rem*rem);
			
			num=num/10;
		}
		System.out.println(rev);
	if(temp==rev)
	{
		
		System.out.println("number is armstrong");
	}
	else
	{
		System.out.println("number is not armstrong");
	}
		
}
}