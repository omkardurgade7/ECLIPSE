package GENERALIZATION;

public class VI implements SIMCARD{
	
	//implementation class
	
	public void sms()
	{
		System.out.println("300 SMS");
	}
	
	public void calling()
	{
		System.out.println("3000 muiutes");
	}
	
	public void internet()
	{
		System.out.println("2.5 GB");
	}
	
	public static void main(String[] args) {
		
		VI v1=new VI();
		
		v1.calling();
		v1.sms();
		v1.internet();
		
	}

}
