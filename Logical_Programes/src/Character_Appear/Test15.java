package Character_Appear;

public class Test15 
{
    public static void main(String[] args) {
		
    	String word="LAPTOP";
    	char which='P';
    	int how=0;
    	
    	for(int i=1; i<word.length(); i++)
    	
    		if(word.charAt(i)==which)
    			how++;
    		{
    			System.out.println("p word appears "+how+" times");
    		}
    	
    	
	}
}
