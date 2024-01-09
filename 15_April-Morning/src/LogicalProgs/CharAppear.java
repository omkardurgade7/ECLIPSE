package LogicalProgs;

public class CharAppear {
       
	public static void main(String[] args) {
		String what="IF YOU GOOD AT SOMETHING NEVER DO IT FOR FREE";
		char which='O';
		int how=0;
		
		for(int i=0; i<what.length(); i++)
		{
			if(what.charAt(i)==which)
				how++;
		}
		System.out.println("'"+which+"' Character Apppears "+how+" Times");
	}
}
