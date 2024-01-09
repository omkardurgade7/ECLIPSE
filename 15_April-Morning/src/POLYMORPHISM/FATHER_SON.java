package POLYMORPHISM;

public class FATHER_SON {

	
	public static void main(String[] args) {
		
		//call the son method
		
		SON u1=new SON();
		 u1.car();
		 u1.home();
		 u1.money();
		 
		 //call the father class
		 
		 FATHER k1=new FATHER();
		 k1.car();
		 k1.home();
		 k1.money();
	}
}
