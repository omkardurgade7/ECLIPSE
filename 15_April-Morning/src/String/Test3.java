package String;

public class Test3 {
	public static void main(String[] args) {
		
		String w1="Mark zukerberg";
	    String w2="";
		String w3="META";
		String w4="ELON MUSK";
		String w5="BILLIONAIR";
		String w6="xyzxyxy";
		String w7="facebook whatsapp";
		String w8="Elon Musk";
		
		System.out.println(w1.length());
		
		System.out.println(w1.isEmpty());
		
		System.out.println(w2.isEmpty());
		
		System.out.println(w1.toUpperCase());
		
		System.out.println(w3.toLowerCase());
		
		System.out.println(w1.equals(w4));
		
		System.out.println(w1.equalsIgnoreCase(w4));
		
		System.out.println(w1.contains(w5));
		
		System.out.println(w1.charAt(0));
		
		System.out.println(w1.charAt(1));
		
		System.out.println(w1.charAt(2));
		
		System.out.println(w1.charAt(3));
		
		System.out.println(w1.charAt(4));
		
		System.out.println(w1.startsWith("om"));
		
		System.out.println(w1.indexOf('o'));
		
		System.out.println(w1.indexOf('1'));
		
		System.out.println(w1.indexOf('2'));
		
		System.out.println(w6.lastIndexOf('x'));
		
		System.out.println(w1.substring(4));
		
		System.out.println(w1.substring(3, 4));
				
		System.out.println(w1+" "+w7);
		
		System.out.println(w8.replace("Elon", "Mark"));
		
		System.out.println(w8.replace("Musk", "Zukerberg"));
	}
}
