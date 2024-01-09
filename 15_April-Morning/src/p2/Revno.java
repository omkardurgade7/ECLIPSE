package p2;

public class Revno {
public static void main(String[] args) {

	String no="";
	
	for(int i="54321".length()-1; i>=0; i--)
	{
		no=no+"54321".charAt(i);
	}
	
	System.out.println(no);
}
}