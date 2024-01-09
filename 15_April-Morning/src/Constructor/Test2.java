package Constructor;

public class Test2 {

String cricketer;
int runs;

Test2 (String n1,int r1)
{
	this.cricketer=n1;
	this.runs=r1;
	
	System.out.println(n1);
	System.out.println(r1);
}
public static void main(String[] args) {
	
	Test2 s1=new Test2("Virat",100);
	
	Test2 s2=new Test2("Rohit",100);
}
	
}
