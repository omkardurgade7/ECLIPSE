package Pallendrone;

public class Test3 {

	
	  public static void main(String[] args) {
		
		  
		  String name="DAD";
		  
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
				  System.out.println("string is not pallendrone");
			  }
	}
}
