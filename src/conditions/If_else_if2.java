package conditions;

public class If_else_if2 {                   // ##  if else if or ladder if


	public static void main(String[] args) {
		int a = 10, b = 20, c = 7;

	      if( a > b && a > c)
	          System.out.println(a+" is the largest Number");

	      else if (b > a && b > c)                              // in && operator both condition must true 
	          System.out.println(b+" is the largest Number");

	      else
	          System.out.println(c+" is the largest Number");

	}

}
