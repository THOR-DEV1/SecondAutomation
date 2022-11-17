package demojava;

public class execption {

	public static void main(String[] args) {
		int i=12;
		try {
		System.out.println(i/0);
		}catch(ArithmeticException e) {
			System.out.println("No internet");
			//e.printStackTrace();
		}
		System.out.println(i+2);

	}

}
