package White_Spaces;

public class Test3 
{

	
	   public static void main(String[] args) {
		
		   String word="okay i am calling";
		   char which=' ';
		   int how=0;
		   
		   for(int i=1; i<word.length(); i++)
		   {
			   if(word.charAt(i)==which)
				   how++;
		   }
		   System.out.println("White spaces="+how);
	}
}
