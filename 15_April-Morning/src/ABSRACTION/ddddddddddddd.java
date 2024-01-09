package ABSRACTION;

public class ddddddddddddd {

	
	
	public static void main(String[] args) 
	{
		String S1="velocity";
		String S2="";
		String S3="ABCD";
		String S4="VELOCITY";
		String S5="city";
		String S6="abcabab";
		String S7="classes";
		String S8="Manual Classes";
		
		//To get Size/Capacity
		System.out.println(S1.length());  //8
		
		//to verify S1,S2 are empty or not
		System.out.println(S1.isEmpty());//false
		System.out.println(S2.isEmpty());//true
		
		//To convert to uppercase
		System.out.println(S1.toUpperCase());//VELOCITY
		
		//To convert to Lowercase
		System.out.println(S3.toLowerCase());//abcd
		
		//To compare S1 and S4
		System.out.println(S1.equals(S4)); //False
		
		//To compare S1 and S4
		System.out.println(S1.equalsIgnoreCase(S4));  //true
		
		//To compare S1 and S5
		System.out.println(S1.contains(S5)); //true
			
		//To get character by providing index
		System.out.println(S1.charAt(0));  //v
		
		//To verify String S1 starts with "ve" 
		System.out.println(S1.startsWith("ve"));//true
		
		//To verify String S1 ends with "ty"
		System.out.println(S1.endsWith("ty")); //true
		
		//To get index of character
		System.out.println(S1.indexOf('v'));//0
		//To get last index of character
		System.out.println(S6.lastIndexOf('a'));//5
		
		//To get substring
		System.out.println(S1.substring(4, 6));  //ci
		
		//To get substring
		System.out.println(S1.substring(4));//city
		
		//To concat S1 and S7
		System.out.println(S1+S7);//velocityclasses
		    //OR
		System.out.println(S1.concat(S7));//velocityclasses
		
		//To replace
System.out.println(S8.replace("Manual", "Automation"));  //Automation Classes
		
	}

}
