package LogicalProgs;

public class Pallendrone3 {

	
	public static void main(String[] args) {
		
		String a="";
        String name="BOB";
        int o;
        for(o=name.length()-1; o>=0; o--)
        {
        	a=a+name.charAt(o);
        }
        if((name).equals(a))
        {
        	System.out.println("string is pallendrone");
        }
        else 
        {
        	System.out.println("String is not pallendrone");
        }	
	
	
	}
	
}
