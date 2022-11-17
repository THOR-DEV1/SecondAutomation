package JavaExamples;

public class Ex_ClassObjnMethod {

	public static void main(String[] args) {
		System.out.println("In main method");
		Ex_ClassObjnMethod obj = new Ex_ClassObjnMethod();//Object
		obj.myMethod();
		obj.myMethod1();
		myMethod2();
	}
	//user define method
	public void myMethod() {
		System.out.println("This is my method");
	}

	public void myMethod1() {
		System.out.println("This is my method 1");
	}
	
	//static
	public static void myMethod2() {
		System.out.println("It is a static method");
	}


}
