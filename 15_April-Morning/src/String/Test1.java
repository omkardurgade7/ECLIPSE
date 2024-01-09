package String;

public class Test1 {

	public static void main(String[] args) {
		
		String k1="omkar";
	    String k2="";
		String k3="WXYZ";
		String k4="OMKAR";
		String k5="sarkar";
		String k6="xyzxyxy";
		String k7="Quality analyst";
		String k8="Manual Classes";
		
		System.out.println(k1.length());
		
		System.out.println(k1.isEmpty());//k1-False
		System.out.println(k2.isEmpty());//k2-True
		
		System.out.println(k1.toUpperCase());//k1-OMKAR
		
		System.out.println(k3.toLowerCase());//k3-wxyz
		
		System.out.println(k1.equals(k4));//k1=k4-false
		
		System.out.println(k1.equalsIgnoreCase(k4));//True
		
		System.out.println(k1.contains(k5));//false
		
		System.out.println(k1.charAt(0));//o
		System.out.println(k1.charAt(1));//m
		System.out.println(k1.charAt(2));//k
		System.out.println(k1.charAt(3));//a
		System.out.println(k1.charAt(4));//r
		
		System.out.println(k1.startsWith("om"));//true
		
		System.out.println(k1.indexOf('o'));
		System.out.println(k1.indexOf('1'));
		System.out.println(k1.indexOf('2'));
		
		System.out.println(k6.lastIndexOf('x'));
		
		System.out.println(k1.substring(4));
		
		System.out.println(k1.substring(3, 4));
				
		System.out.println(k1+" "+k7);
		
		System.out.println(k8.replace("Manual", "Automation"));
	}
	
	
}
