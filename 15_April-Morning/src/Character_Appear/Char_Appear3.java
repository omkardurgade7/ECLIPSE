package Character_Appear;

public class Char_Appear3 {

	   public static void main(String[] args) {
		
		   String quote="WHAT COLOUR IS YOUR BUGGATI";
		   
		   char white=' ';
		   
		   int how=0;
		   
		   for(int i=0; i<quote.length(); i++)
			   if(quote.charAt(i)==white)
				   how++;
			   {
				   System.out.println("white spaces"+" Appeared in "+how+" times");
			   }
		   
	}
}
