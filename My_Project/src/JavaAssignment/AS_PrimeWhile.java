package JavaAssignment;

import java.util.Scanner;

public class AS_PrimeWhile {

	public static void main(String[] args) {
		int num,i=2,flag=0;
	      System.out.println("Enter an Num: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
		while (i <= num / 2) {
		      // condition for nonprime number
		      if (num % i == 0) {
		    	  System.out.println(num+" is a Not Prime");
		        flag = 1;
		        break;
		      }

		      i++;
		    }

		    if (flag==0)
		      System.out.println(num + " is a prime number.");

	}

}
