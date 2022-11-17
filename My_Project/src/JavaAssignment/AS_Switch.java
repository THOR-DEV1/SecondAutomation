package JavaAssignment;

import java.util.Scanner;

public class AS_Switch {

	public static void main(String[] args) {
		int a,b,choice;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a value of a: ");
        a = obj.nextInt();
        System.out.println("Enter a value of b: ");
        b = obj.nextInt();
        System.out.println("Enter your choice 1. Add 2.Sub 3.Multi ");
        choice = obj.nextInt();
        
        switch(choice)
        {
        case 1:
        	System.out.println("Addition is "+(a+b));
        	break;
        case 2:
        	System.out.println("Sub is "+(a-b));
        	break;
        case 3:
        	System.out.println("Multiplication is "+(a*b));
        	break;	
        default:
        	System.out.println("Wrong choice...");
        }

	}

}
