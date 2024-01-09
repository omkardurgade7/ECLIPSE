package p1;

public class RevString {

	
	public static void main(String[] args) {
		
		String mm="";
		
		for(int u="My name is omkar".length()-1; u>=0; u--)
		{
			mm=mm+"my name is omkar".charAt(u);
		}
		System.out.println(mm);
	}
}
