package Methods;


//non static call from same class
public class Demo2_methods_nonstaticmethodcallfromsameclass {

	
	public static void main(String[] args) {
		
Demo2_methods_nonstaticmethodcallfromsameclass s1=new Demo2_methods_nonstaticmethodcallfromsameclass();	//classname objectname=new classnameS
	

s1.m1();    //objectname.methodname
	
	}
	
	
	//Non static regula method
	public void m1()
	{
		
		System.out.println("nonstatic method call fron same class");
		
		
	}
	
	
}
