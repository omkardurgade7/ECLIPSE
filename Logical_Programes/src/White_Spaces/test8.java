package White_Spaces;

public class test8 {

	  public static void main(String[] args) {
		
		  String word="automation manual sql api";
		  char which=' ';
		  int how=0;
		  
		  for(int i=1; i<word.length(); i++)
		  {
			  if(word.charAt(i)==which)
				  how++;
			  {
				  
			  }
		  }
		  System.out.println("White spaces = "+how);
	}
}
