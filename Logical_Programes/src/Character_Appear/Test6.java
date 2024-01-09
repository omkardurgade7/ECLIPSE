package Character_Appear;

public class Test6 
{
public static void main(String[] args) {

	   String word="abbadabbajabba";
	   char which='b';
	   int how=0;
	   
	   for(int i=1; i<word.length(); i++)
	   {
		   if(word.charAt(i)==which)
			   how++;
	   }
	   System.out.println(which+" character appears "+how+" times");
}
}