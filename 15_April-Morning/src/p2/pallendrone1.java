package p2;

public class pallendrone1 {
public static void main(String[] args) {
	
	String num="";
	
	String a="12321";
	
	for(int i=a.length()-1; i>=0; i--)
	{
		num=num+a.charAt(i);
	}
	
	if(num.equals(a))
	{
		System.out.println("given number is pallendrone");
	}
	
	else
	{
		System.out.println("given number is not pallendrone");
	}
	
	
	
	
	
	
}
}
