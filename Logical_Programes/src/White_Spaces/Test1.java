package White_Spaces;

public class Test1 {

	
	  public static void main(String[] args) {
		
		  
		  String word="enter the number";
		  char which=' ';
		  int how=0;
		  
		  for(int i=0; i<word.length()-1; i++)
		  {
			  if(word.charAt(i)==which)
				  how++;
		  }
		  System.out.println("White spaces : "+how);
	}
}
