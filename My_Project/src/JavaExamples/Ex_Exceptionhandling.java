package JavaExamples;

public class Ex_Exceptionhandling {

	public static void main(String[] args) {
		int a = 20;
		int b = 0;
		try {
		   int ans = a/b;
		   System.out.println("Ans is "+ans);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
        	System.out.println("I am always thr...");
        }
		System.out.println("bye bye.....");
        
	}

}
