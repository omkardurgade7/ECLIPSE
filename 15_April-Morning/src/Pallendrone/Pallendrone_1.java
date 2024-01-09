package Pallendrone;

public class Pallendrone_1 {
    public static void main(String[] args) {
		
    	String name="DAD";
    	String qq="";
    	
    	for(int i=name.length()-1; i>=0; i--)
    	{
    		qq=qq+name.charAt(i);
    	}
    	if(name.equals(qq))
		{
			System.out.println("Given name is pallendrone");
		}
		else
		{
			System.out.println("Given name is not pallendrone");
		}
	}
}
