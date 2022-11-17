package JavaExamples;

public class Ex_Methodoverloading {

	public static void main(String[] args) {
		Ex_Methodoverloading obj = new Ex_Methodoverloading();
		obj.addtn(2, 3);
		obj.addtn(10, 3, 5);

	}
	public void addtn(int a,int b) {
		System.out.println("Two nos. "+(a+b));
	}
	
	public void addtn(int a,int b,int c) {
		System.out.println("Three nos. "+(a+b+c));
	}

}
