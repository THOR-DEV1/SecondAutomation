package JavaAssignment;

public class AS_Factorial {

	public static void main(String[] args) {
		int i,fact=1;
		int n=7;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number:"+fact);
	}

}
