package JavaAssignment;

public class AS_SubstingOfString {

	public static void main(String[] args) {
		String t1="Hi Hello World",t2="Java";
		boolean result=t1.contains(t2);
		if(result) {
			System.out.println(t2+" present in "+t1);
		}
		else {
			System.out.println(t2+" Not present in "+t1);
		}

	}

}
