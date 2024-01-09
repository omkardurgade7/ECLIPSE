package p6;

public class WhiteSpaces {

	  public static void main(String[] args) {
		 
		String a="JAVA IS ROBUST LANGUAGE";
		char b=' ';
		int how=0;
		
		for(int i=0; i<a.length(); i++)
		{
			if(a.charAt(i)==b)
				how++;
		} 
		System.out.println("White Spaces : "+how);
	  }	
}
