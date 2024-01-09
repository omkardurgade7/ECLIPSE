package Reverse_Number;

public class test6 {

	
	//print reverse number from 20 to 1 and add them

	public static void main(String[]args)
	{
	int a=20;
	int b=1;
	int sum=0;

	for(int i=a; i>=b; i--)
	{
	sum=sum+i;
	}
	System.out.println(sum);
	}
}
