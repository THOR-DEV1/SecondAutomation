package JavaAssignment;

import java.util.Scanner;

public class AS_SumNatural {

	public static void main(String[] args) {
		int num;
	      System.out.println("Enter an Num: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();
		int i, sum = 0;   
		for(i = 1; i <= num; i++)  
		{  
		sum = sum + i;  
		}   
		System.out.println("Sum of Natural Numbers is = " + sum);  

	}

}
