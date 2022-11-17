package JavaAssignment;
class Student{
	String name;
	int Roll_no;
}
public class AS_Student {

	public static void main(String[] args) {
		Student s=new Student();
		s.name="John";
		s.Roll_no=2;
		System.out.println("Name is "+s.name+" and Roll no is "+s.Roll_no);
	}

}
