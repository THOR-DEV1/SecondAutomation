package JavaAssignment;

import java.util.Scanner;

public class AS_TrianglePeri {
	private static Scanner sc;

	public static void main(String[] args) {
		double a,b,c,peri,area,s;
		sc=new Scanner(System.in);
		System.out.println("Enter No's:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		peri=(a+b+c);
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Perimeter of triangle:"+peri+" and area:"+area);
	}

}
