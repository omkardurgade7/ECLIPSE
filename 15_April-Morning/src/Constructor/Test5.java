package Constructor;

public class Test5 {

	
	String playername;
	int age;
	 
	Test5(String p1,int a1)
	{
		this.playername=p1;
		this.age=a1;
		System.out.println(p1);
		System.out.println(a1);
	}
	public static void main(String[] args) {
		Test5 a1=new Test5("Naruto",18);
	}
}
