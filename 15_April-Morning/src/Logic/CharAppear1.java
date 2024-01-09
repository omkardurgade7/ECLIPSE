package Logic;

public class CharAppear1 {
    public static void main(String[] args) {
		
    	String input="acc";	
    	
    	char search = 'c';
    	
    	int character=0;
    	for(int i=0; i<input.length(); i++)
    	{
    		if(input.charAt(i) == search)
    			character++;
    	}
    			System.out.println("The character'"+search+"' appears "+character+" times");
    		
    	}
	}

