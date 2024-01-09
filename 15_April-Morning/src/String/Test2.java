package String;

public class Test2 {

	public static void main(String[] args) {
		
		
		String a="OMKAR";
		String b="omkar";
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(a.concat(b));
		System.out.println(b.length());
		
		System.out.println(a.indexOf('M'));
		System.out.println(a.indexOf('R'));
		System.out.println(b.indexOf('a'));
		System.out.println(b.indexOf('k'));
	
		System.out.println(b.substring(4));
		System.out.println(a.substring(3, 4));
			
		System.out.println(a+" "+b);	
		System.out.println(b.replace("OMKAR", "omkar"));
	}
	
}
