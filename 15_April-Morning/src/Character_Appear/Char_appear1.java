package Character_Appear;

public class Char_appear1 {

	    public static void main(String[] args) {
			
	    	String a="abbabababa";
	    	
	    	char which='b';
	    	
	    	int how=0;
	    	
	    	for(int i=0; i<a.length(); i++)
	    	
	    		if(a.charAt(i)==which)
	    			how++;
	    		{
	    			System.out.println(which+" Character appears "+how+" many times");
	    		}
	    	
	    	
	   	
		}
}
