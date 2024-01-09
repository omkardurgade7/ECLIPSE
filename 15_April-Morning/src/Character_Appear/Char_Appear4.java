package Character_Appear;

public class Char_Appear4 {

	    public static void main(String[] args) {
			
	    	String word="KACCHAPAPADPAKKAPAPAD";
	    	char which='P';
	    	int how=0;
	    	
	    	for(int i=0; i<word.length(); i++)
	    		if(word.charAt(i)==which)
	    			how++;
	    			{
	    			System.out.println(which+" Character Appears "+how+" Times");
	    			}
		}
}
