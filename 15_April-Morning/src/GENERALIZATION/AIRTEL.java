package GENERALIZATION;

public class AIRTEL implements SIMCARD {

	//implementation class 1
	
	public void sms()
	{
		System.out.println("200 SMS ");
	}
	
	public void calling()
	{
    System.out.println("2000 minutes");
    }
	
	public void internet()
	{
		System.out.println("2 GB");
	}
public static void main(String[] args) {
	
	
	AIRTEL s1 =new AIRTEL();
	
	s1.sms();
	s1.calling();
	s1.internet();
}




}


