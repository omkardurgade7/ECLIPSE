package Pallendrone;

public class test12 
{
   public static void main(String[] args) {
	
	   String word="abccba";
	   
	   String okay="";
	   
	   for(int i=word.length()-1; i>=0; i--)
	   
		  okay=okay+word.charAt(i);
		  
		  if(word.equals(okay))
		  {
			  System.out.println("pallendrone");
		  }
		  else
		  {
			  System.out.println("not pallendrone");
		  }
	   
}
}
