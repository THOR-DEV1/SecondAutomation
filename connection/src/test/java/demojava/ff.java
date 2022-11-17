package demojava;

public class ff extends Vehicle {
	public void key() {
		System.out.println("Started...");
	}
	public static void main(String[] args) {
		ff dd=new ff();
		dd.key();
		System.out.println("Hello "+dd.brand);
		dd.honk();
		dd.speed(100);

	}

}
