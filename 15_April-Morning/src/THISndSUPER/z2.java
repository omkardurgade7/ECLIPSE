package THISndSUPER;

public class z2 extends z1
{

	
	
	int population=1800000000;
	
	public void stats()
	{
		int number=5; 
		
		System.out.println(super.country);
		System.out.println(super.year);
		System.out.println(this.population);
		
		System.out.println(number);
	}
	
	public static void main(String[] args) {
		
		z2 h1=new z2();
		
		h1.stats();
	}
}
