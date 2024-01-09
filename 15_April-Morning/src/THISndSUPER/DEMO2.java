package THISndSUPER;

public class DEMO2 extends DEMO1 {

	
	String team="India";
	String name="BCCI";
	
	public void cricket()
	{
		int jerseynumber=18;
		
		System.out.println("Jersey NO.:"+jerseynumber);
		System.out.println("Team:"+this.team);
		System.out.println("Board Name:"+this.name);
		
		System.out.println("Player Name:"+super.name);
		System.out.println("Total Runs:"+super.runs);
		System.out.println("Grade:"+super.grade);
	}
	
	public static void main(String[] args) {
		 
		DEMO2 b1=new DEMO2();
		 
		b1.cricket();
	}
}
