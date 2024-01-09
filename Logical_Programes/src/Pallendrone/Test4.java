package Pallendrone;

public class Test4 {

	
	public static void main(String[] args) {
		
		String name="NATAN";
		String okay="";
		
		for(int i=name.length()-1; i>=0; i--)
		{
			okay=okay+name.charAt(i);
		}
		if(name.equals(okay))
		{
			System.out.println("String is pallendrone");
		}
		else
		{
			System.out.println("String is not pallendrone");
		}
	}
}
