package Pallendrone;

public class test14 
{
   public static void main(String[] args) 
{
	String name="AVA";
	String okay="";
	
	for(int i=name.length()-1; i>=0; i--)
	{
		okay=okay+name.charAt(i);
	}
		if(name.equals(okay))
		{
			System.out.println("pallendrone");
		}
		else
		{
			System.out.println("not pallendrone");
		}
		
	
	   
}
}
