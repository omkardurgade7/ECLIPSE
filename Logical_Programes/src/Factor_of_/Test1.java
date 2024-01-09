package Factor_of_;

public class Test1 {
    
	public static void main(String[] args) {	
		//factor of 5
		int a=5;
		int factor=1;
		for(int i=1; i<=a; i++)
		{
			factor*=i;
		}
		System.out.println(factor);
	}
}
