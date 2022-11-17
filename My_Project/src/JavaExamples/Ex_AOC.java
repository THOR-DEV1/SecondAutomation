package JavaExamples;
import java.util.Scanner;
public class Ex_AOC {

	public static void main(String[] args) {
		final float PI=3.142f,aoc;// final - constant in java
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter radius ");
		int radius = obj.nextInt();
		
		aoc = PI * radius * radius;
		
		System.out.println("AOC is "+aoc);

	}

}
