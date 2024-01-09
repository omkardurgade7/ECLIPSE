package p2;

public class pallendrone {

	public static void main(String[] args) {
		
	String java="";
	
	String name="RADAR";
	int i; 
	
	for(i=name.length()-1; i>=0; i--)
	{
		java=java+name.charAt(i);
	}
	if(name.equals(java)) {
	System.out.println("The given String is pallendrone");
	}
	
	else
	{
		System.out.println("Given String is not pallendrone");
	}
}
}