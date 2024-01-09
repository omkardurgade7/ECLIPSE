package Logic;

public class Charappear {

	    public static void main(String[] args) {
			
	    	String input="aabbbcbbbbbbb";
	    	
	    	  char search = 'b';           
	    	  
	    	  int character=0;
	    	  for(int i=0; i<input.length(); i++)
	    	  {
	    	      if(input.charAt(i) == search)
	    	      character++;
	    	  }
	    	  
	    	  System.out.println("The Character '"+search+"' appears "+character+" times.");
		}
}
