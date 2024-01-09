package POLYMORPHISM;

public class RUNTIME3 {

	
	public static void main(String[] args) {
		
		//create a object of sub class
		
		RUNTIME1 h1=new RUNTIME1();
		 
		h1.bike();
		h1.car();
		h1.home();
		h1.money();
		
		//create a object of father class
		
		RUNTIME y1=new RUNTIME();
		y1.car();
		y1.home();
		y1.money();
	}
}
