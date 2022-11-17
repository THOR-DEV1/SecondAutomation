package JavaAssignment;

import java.util.Scanner;

public class AS_POSNEG {

	public static void main(String[] args) {
		  int num;
	      System.out.println("Enter an Num: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
		if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("Number. is a ZERO.");

	}

}
