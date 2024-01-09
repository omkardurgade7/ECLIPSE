package Logic;

public class CharAppear2 {
    public static void main(String[] args) {
		
    	String india="india is my country";
    	
    	char value='i';
    	
    	int okay=0;
    	
    	for(int i=0; i<india.length(); i++)
    	{
    		if(india.charAt(i)==value)
    			okay++;
    	}
    	System.out.println("The Character "+value+" appears "+okay+" times");
	}
}
