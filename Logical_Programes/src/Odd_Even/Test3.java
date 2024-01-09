package Odd_Even;

public class Test3 {

	
	 /* public static void main(String[] args) {
		
		  int number=56;
		  
		  if(number%2==0)
		  {
			  System.out.println("number is even");
		  }
		  else
		  {
			  System.out.println("number ids odd");
		  }
	} */
	public static void main(String[] args) {
	
	String str = "I am good";
    String rev = reverse(str);
    System.out.println("Reversed sentence: " + rev);
}

public static String reverse(String s) {
// Finding the index of the white spaces
int x = s.indexOf(" ");

//Base condition
if(x == -1)
  return s;
  
 //Recursive call
return reverse(s.substring(x+1)) +" "+ s.substring(0, x);
}

}
