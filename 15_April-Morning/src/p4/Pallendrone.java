package p4;

public class Pallendrone {
public static void main(String[] args) {
	
	String surname="";
	
	for(int a="ARORA".length()-1; a>=0; a--)
	{
		surname=surname+"ARORA".charAt(a);
	}
	
	if("ARORA".equals(surname))
	{
		System.out.println("String is pallendrone");
	}
	else
	{
		System.out.println("String is not pallendrone");
	}
}
}
