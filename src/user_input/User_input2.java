package user_input;

import java.util.Scanner;

public class User_input2 {

	
	public static void main(String[] args) {

		String a;
		String b;
		String c;
		System.out.println("Enter The Name");
        Scanner s=new Scanner(System.in);
        a=s.next().toString();   // for chrector
        
        System.out.println("Enter The Surname");
        b=s.next().toString();
        
        
        System.out.print(a+b);
        
       
		
	}


}
