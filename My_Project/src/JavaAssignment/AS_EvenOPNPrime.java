package JavaAssignment;

import java.util.Scanner;

public class AS_EvenOPNPrime {

	public static void main(String[] args) {
		  int num,Option;
	      System.out.println("Enter an Num: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
	      System.out.println("Select option: 1:even or odd 2:prime or non-prime");
	      Option=sc.nextInt();
	      int flags=0;
	      if(Option==1) {
	    	  if(num%2==0) {
	    		  System.out.println(num+" is a even");
	    	  }
	    	  else {
	    		  System.out.println(num+" is a odd");
	    	  }
	      }
	      else {
	    	  for (int i = 2; i <= num / 2;i++) {
	    	      if (num % i == 0) {
	    	    	  System.out.println(num+" is a  not prime");
	    	    	  flags=1;
	    	        break;
	    	      }
	    	    }
	    	  if(flags==0) {
	    		  System.out.println(num+" is a prime");
	    	  }
	      }

	}

}
