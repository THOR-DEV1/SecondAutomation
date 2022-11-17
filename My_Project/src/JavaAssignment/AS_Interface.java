package JavaAssignment;

interface showable{
	void show();
}
interface printable{
	void print();
}
public class AS_Interface implements printable,showable {

	public static void main(String[] args) {
		AS_Interface obj =new AS_Interface();
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
