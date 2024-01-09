package THISndSUPER;

public class Test2 extends Test1 {

	//sub class / child class
	//int a=40; fron superclass
	
	int a=20;     //globalvariable sameclass
	int b=30;
	//this keyword use to call global,local variables from same class
	//super keyword use to call global,local variables from ((diffclass))
	public void m1()
	{
		int a=10;  //local variable sameclass
		
		System.out.println(a);  //10
		
		System.out.println(a); //10
		
		System.out.println(this.a); //20     this.variablename  from sameclass
		
		System.out.println(b); //30     
		
		System.out.println(this.b); //  30     this.variablename from sameclass
		
		System.out.println(this.a);   //20     this.variablename from sameclass
		
		System.out.println(super.a);  //40    super.variablename from diffclass
	}
	public static void main(String[] args) {
		
		Test2 u1=new Test2();    
		u1.m1();
	}
	
}
