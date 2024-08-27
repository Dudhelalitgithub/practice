package user_input;

import java.util.Scanner;

public class User_input1 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		
		System.out.println("Enter the first value");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("Enter the Second value");
		b=s.nextInt();
		
		c=a+b;
		System.out.println("the addition is"+" "+c);
		
	}

}
