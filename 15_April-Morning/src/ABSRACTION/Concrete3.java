package ABSRACTION;

public class Concrete3 extends Abstract3 {

	
	public void faculty()
	{
		System.out.println("****");
	}
	
	public void students()
	{
		System.out.println("****");
	}
	
	public static void main(String[] args) {
		
	Concrete3 u1=new Concrete3();
	
	u1.university();
	u1.college();
	u1.faculty();
	u1.students();
	
	}

}
