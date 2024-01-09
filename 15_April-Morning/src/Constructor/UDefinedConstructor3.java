package Constructor;

public class UDefinedConstructor3 {


	
	String Name;
	int Runs;
	int Centuries;
	char Grade;
	String Country;
	UDefinedConstructor3()
	{
	    Name="Virat Kohli";
		Runs=25385;
		Centuries=75;
		Grade='A';
		Country="India";
	}
	public void Cricket()
	{
		System.out.println("Player Name:"+Name);
		System.out.println("Runs"+Runs);
		System.out.println("Centuries:"+Centuries); 
		System.out.println("Grade:"+Grade);
		System.out.println("Country:"+Country);
	}
	public static void main(String[] args) {
		
		
		UDefinedConstructor3 h1=new UDefinedConstructor3();
		h1.Cricket();
}}
