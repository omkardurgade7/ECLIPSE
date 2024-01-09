package Inheritance;

public class HierarchicalMAIN {

	
	public static void main(String[] args) {
		
		//create object of hierarchical2
		Hierarchical2 h1=new Hierarchical2();
		h1.car();
		h1.Money();
		h1.Home();
		h1.Mobile();
		
		//create object of hierarchical3
		Hierarchical3 k1=new Hierarchical3();
		k1.car();
		k1.Home();
		k1.bike();
		k1.Money();
		
		//create object of hierarchical4
		Hierarchical4 n1=new Hierarchical4();
		n1.car();
		n1.Home();
		n1.Laptop();
		n1.Money();

	}
}
