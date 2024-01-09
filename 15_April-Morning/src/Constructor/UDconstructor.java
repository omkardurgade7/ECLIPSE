package Constructor;

public class UDconstructor {

	int a;
	int b;
	UDconstructor()
	{
		a=10;
		b=20;
	}
public void addition()
{
	int sum=a+b;
	System.out.println(sum);
}
	
	public static void main(String[] args) {
		
		UDconstructor s1=new UDconstructor();
		s1.addition();
	}
	}

