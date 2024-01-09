package GENERALIZATION;

public class JIO implements SIMCARD {

	//implementation class
	
	public void sms()
	{
		System.out.println("100 SMS");
	}
	
	public void calling()
	{
	System.out.println("1000 minutes");	
	}
	
	public void internet()
	{
		System.out.println("1.5 GB");
	}
	
	public static void main(String[] args) {
		
		JIO y1=new JIO();
		 
		y1.calling();
		y1.internet();
		y1.sms();
	}
}
