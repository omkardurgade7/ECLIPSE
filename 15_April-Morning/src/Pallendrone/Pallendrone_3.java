package Pallendrone;

public class Pallendrone_3 {
        public static void main(String[] args) {
			
        	String s="nayan";
        	String ww="";
        	
        	for(int x=s.length()-1; x>=0; x--)
        	{
        		ww=ww+s.charAt(x);
        	}
        	if(s.equals(ww))
        	{
        		System.out.println("Given String is pallendrone");
        	}
        	else
        	{
        		System.out.println("Given String is not pallendrone");
        	}
		}
}
