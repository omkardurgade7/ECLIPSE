package THISndSUPER;

public class thissuper2 extends thissuper1{

	int a=100;
	String app="FaceBook";
	
	public void k1()
	{
	int y=200;
	
	System.out.println(y);  //200
	System.out.println(this.app);   //faceBook
	System.out.println(this.a);  //100
	
	System.out.println(super.name);
	
	
	}
	
	public static void main(String[] args) {
		
		thissuper2 p1=new thissuper2();
		p1.k1();
	}
	
}
