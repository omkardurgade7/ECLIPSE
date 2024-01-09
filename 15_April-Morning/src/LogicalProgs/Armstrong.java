package LogicalProgs;

public class Armstrong {

public static void main(String[] args) {
	
     //153
	
	int n=153;
	int ok=0;
	
	for(int i=n; i>0; i=i/10)
	{
		int b=i%10;
		
		ok=ok+(b*b*b);
	}
	if(n==(ok))
	{
		System.out.println("Given no. is armstrong number");
	}
	else
	{
		System.out.println("Given No. is not armstrong");
	}
}
}