package JavaAssignment;

import java.util.Scanner;

public class AS_Grade {

	public static void main(String[] args) {
		String grade;
		System.out.println("select grade from list: A,B,C,D,F ");
	      Scanner sc = new Scanner(System.in);
	       grade = sc.next();
	 
	       switch(grade) {
	         case "A" :
	            System.out.println("Excellent!");
	            break;
	         case "B" :
	        	 System.out.println("Good");
	        	 break;
	         case "C" :
	            System.out.println("Ok");
	            break;
	         case "D" :
	            System.out.println("Mmmm...");
	         case "F" :
	            System.out.println("Must do better");
	            break;
	         default :
	         System.out.println("Invalid grade");
	      }

	}

}
