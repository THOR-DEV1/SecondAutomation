package JavaAssignment;

import java.util.Scanner;

public class AS_TableWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i=1;
        System.out.println("Table of "+num+" is: ");
      
        do
        {
           System.out.println(num+" * "+i+" = "+ (num*i));
            i++;
        }
        while(i<=10);
	}

}
