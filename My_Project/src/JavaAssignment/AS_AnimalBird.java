package JavaAssignment;
class Animal{
	void walk() {
		System.out.println("I can walk.....");
	}
}
class bird extends Animal{
	void fly() {
		System.out.println("I can fly.....");
	}
}
public class AS_AnimalBird {

	public static void main(String[] args) {
		bird Bird=new bird();
		Bird.walk();
		Bird.fly();
	}

}
