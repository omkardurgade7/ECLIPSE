package Pallendrone;

public class Pallendrone_2 {

	    public static void main(String[] args) {
			
	    	String name="RADAR";
	    	
	    	String jj="";
	    	
	    	for(int y=name.length()-1; y>=0; y--)
	    	{
	    		jj=jj+name.charAt(y);
	    	}
	    	if(name.equals(jj))
	    	{
	    		System.out.println("String is pallendronne");
	    	}
	    	else
	    	{
	    		System.out.println("Given String is not pallendrone");
	    	}
	    	
		}
}
