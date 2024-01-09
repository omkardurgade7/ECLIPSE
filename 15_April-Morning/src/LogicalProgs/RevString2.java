package LogicalProgs;

public class RevString2 {

	
	public static void main(String[] args) {
		
		String moc="";

		for(int a="google".length()-1; a>=0; a--)
		{
		moc=moc+"google".charAt(a);
		}
		System.out.println(moc);
	}
}
