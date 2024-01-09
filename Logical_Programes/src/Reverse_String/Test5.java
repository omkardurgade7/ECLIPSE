package Reverse_String;

public class Test5 
{

	   public static void main(String[] args) {
		
		   String okay="NUMBER";
		   String word="";
		   
		   for(int i=okay.length()-1; i>=0; i--)
		   {
			   word=word+okay.charAt(i);
		   }
		   System.out.println(word);
	}
}
