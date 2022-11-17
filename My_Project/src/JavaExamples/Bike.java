package JavaExamples;
class Vehicle{
	public void run() {
		System.out.println("Vechicle is running....");
	}
}
public class Bike extends Vehicle {

	public static void main(String[] args) {
		Bike obj=new Bike();
		obj.run();

	}
	public void run() {
		System.out.println("Bike is running....");
	}

}
