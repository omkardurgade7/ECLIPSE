package p2;

public class RevString {

	
	public static void main(String[] args) {
		
		String okok="";
		String name="ROCKY";
		
		for(int b=name.length()-1; b>=0; b--)
		{
			okok=okok+name.charAt(b);
		}
		System.out.println(okok);
	}
}
