package VARIABLES;


//non static global variable call from same class
public class NSGVcfsm {

	
	int a=20;   //non static global variable
	
	public static void main(String[] args) {
		
		//step1 create object of same class
		NSGVcfsm s1=new NSGVcfsm();  //classname ob. name =new classname();
		//classname objectname=new classname();
		
		//step2 call the variable
		System.out.println(s1.a);
		//System.out.println(objectname.methodname	);
	}
	
}
