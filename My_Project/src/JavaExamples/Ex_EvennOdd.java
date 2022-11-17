package JavaExamples;
import java.util.Scanner;
public class Ex_EvennOdd {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = obj.nextInt();
		
		if (num % 2 ==0 ) {
			System.out.println("Even no. "+num);
		}else {
			System.out.println("Odd no. "+num);
		}
	}

}
