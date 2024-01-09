package p6;

public class WhiteSpaces1 {
        public static void main(String[] args) {
			
        	String space="IF YOU GOOD AT SOMETHING NEVER DO IT FOR FREE";
        	char white=' ';
        	int how=0;
        	
        	for(int i=0; i<space.length(); i++)
        	{
        		if(space.charAt(i)==white)
        			how++;
        	}
        	System.out.println("White Spaces : "+how);
		}
}
