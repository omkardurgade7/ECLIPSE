package Character_Appear;

public class Char_Appear2 {
    public static void main(String[] args) {
		
    	String word="ENTERTAINMENT";
    	char which='E';
    	int how=0;
    	
    	for(int i=0; i<word.length(); i++)
    		
    		if(word.charAt(i)==which)
    			how++;
    		{
    			System.out.println(which+" Appears "+how+" many times");
    		}
	}
}
