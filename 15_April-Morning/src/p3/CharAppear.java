package p3;

public class CharAppear {

	    public static void main(String[] args) {
			
	    String gg="abbba jabbba dabbba"	;
	    char okay='b';
	    int how=0;
	    
	    for(int i=0; i<gg.length(); i++)
	    {
	    	if(gg.charAt(i)==okay)
	    		how++;
	    }
	    System.out.println("Character "+okay+" appears "+how+" times");
		}
}
