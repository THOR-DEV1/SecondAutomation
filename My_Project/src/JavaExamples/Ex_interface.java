package JavaExamples;
interface showable{
	void show();
}
interface printable{
	void print();
}
public class Ex_interface implements printable,showable{

	public static void main(String[] args) {
		Ex_interface obj =new Ex_interface();
		obj.print();
		obj.show();
	}

	@Override
	public void show() {
		System.out.println("Its showing....!");
	}

	@Override
	public void print() {
		System.out.println("Its printing....!");
		
	}

}
