package p3;

public class WhiteSpaces {

	    public static void main(String[] args) {
			
	    	
	    	String cc="SAY MY NAME";
	    	char sc=' ';
	    	int how=0;
	    	
	    	for(int i=0; i<cc.length(); i++)
	    	{
	    		if(cc.charAt(i)==sc)
	    			how++;
	    	}
	    	System.out.println("White spaces = "+ how);
	    	
		}
}
