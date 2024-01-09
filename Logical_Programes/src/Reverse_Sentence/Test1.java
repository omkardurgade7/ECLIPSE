package Reverse_Sentence;

public class Test1 {

	
	   public static void main(String[] args) {
	
		        String s = "java selenium api";
		        
		        String words[] = s.split(" ");
		        
		        String rev ="";
		        
		        for (int i = words.length-1; i >= 0; i--)
		        {
		            rev+= words[i]+" ";
		        }
		        System.out.println(rev);
	}
}
