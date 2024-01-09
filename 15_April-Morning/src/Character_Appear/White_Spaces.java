package Character_Appear;

public class White_Spaces {

	    public static void main(String[] args) {
			String org="ab c d";
		    char white=' ';
		    int how=0;
		    
		    for(int i=0; i<org.length(); i++)
		    if(org.charAt(i)==white)
		    	how++;
		    {
		    	System.out.println("White spaces = "+how);
		    }
		}
}
