package JavaExamples;

public class Ex_Simplearray1 {

	public static void main(String[] args) {
		int  []rollno = {1,2,3,4,5};
		
		/*for(int i=0;i<rollno.length;i++) {
			System.out.println(rollno[i]);
		}*/
		
		for(int i:rollno) { //for each loop
			System.out.println(i);
		}

	}

}
