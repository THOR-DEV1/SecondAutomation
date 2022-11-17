package JavaAssignment;

public class AS_SwapWithout3 {

	public static void main(String[] args) {
		int a=3,b=4;
		System.out.println("Before Swapping of two numbers:"+a+","+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("Swapping of two numbers:"+a+","+b);
	}

}
