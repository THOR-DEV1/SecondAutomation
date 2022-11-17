package JavaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class AS_List {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(5);
		  arr.add(15);
	      arr.add(22);
	      arr.add(30);
	      arr.add(40);
		int index,value;
		System.out.println("Enter an Index: ");
	    Scanner sc = new Scanner(System.in);
	    index = sc.nextInt();
	    System.out.println("Enter an value: ");
	    value = sc.nextInt();
	    System.out.println("Before Adding:"+arr);
	    arr.add(index,value);
	    System.out.println("After Adding:"+arr);
	}

}
