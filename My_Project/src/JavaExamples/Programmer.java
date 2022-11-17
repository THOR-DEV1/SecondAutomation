package JavaExamples;
class Employee{
	int salary=45000;
}
class Testers extends Employee{
	static int tsalary=45000;
}
public class Programmer extends Testers {

	public static void main(String[] args) {
		Employee obj=new Employee();
		int pbonus=10000;
		int totalsalary=obj.salary+pbonus;
		System.out.println("Total salary of programmer is "+totalsalary);
		int Tbonus=15000;
		int Ttotal_Salary= tsalary+Tbonus;
		System.out.println("Total salary of Tester is "+Ttotal_Salary);

	}

}
