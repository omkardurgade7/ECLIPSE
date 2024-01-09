package Constructor;

public class Test1 {
//que why do we need consttructor?
	//ans initialization of an object
	
	String cricketer;  //Virat Rohit Shubhman
	int runs;  //100 100 100
	
	Test1(String c1,int r1)
	{
	this.cricketer=c1; //virat rohit shubhman
	this.runs=r1; //100 100 100
		
		System.out.println(c1);//virat rohit shubhman
		System.out.println(r1);//100 100 100
		
	}
public static void main(String[] args) {
	
	Test1 t1=new Test1("Virat",100);//classname objectname=new classname(parameters);
	
	Test1 t2=new Test1("Rohit",100);//classname objectname=new classname(parameters);
	
	Test1 t3=new Test1("Shubman",100);//classname objectname=new classname(parameters);
	
}
}