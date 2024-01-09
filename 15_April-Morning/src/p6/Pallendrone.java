package p6;

public class Pallendrone {
      
	public static void main(String[] args) {
		
	
	String num="";
	
	for(int i="MOM".length()-1; i>=0; i--)
	{
		num=num+"MOM".charAt(i);
	}
	
	if("MOM".equals(num))
	{
		System.out.println("String is pallendrone");
	}
	else
	{
		System.out.println("String is not pallendrone");
	}
}
}