package demojava;

public class recurssion {
	static void my() {
		String x="Static";//Attributes
		System.out.println(x+" method called");
	}
	public void my2() {
		String x="Public";//Attributes
		System.out.println(x+" method called");
	}
	public static void main(String[] args) {
		my();
		recurssion obj=new recurssion();//constructor/obj creation
		obj.my2();

	}

}
