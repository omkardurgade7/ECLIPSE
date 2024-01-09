package Character_Appear;

public class Test11 {
	
	public static void main(String[] args) {
		
		String name="SUMMARY";
		char which='M';
		int how=0;
		
		for(int i=1; i<name.length(); i++)
		{
			if(name.charAt(i)==which)
				how++;
			{
				
			}
			
		}
		System.out.println(which+" character appears "+how+" times");	
	}

}
