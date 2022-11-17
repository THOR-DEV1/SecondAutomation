package JavaExamples;

import java.util.ArrayList;

public class EX_ArrayList {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(12);
		obj.add(1.2);
		obj.add("Vineel");
		obj.add(null);
		obj.add(12);
		System.out.println(obj);
		obj.remove(0);
		System.out.println(obj);
		obj.add(0,15);
		System.out.println(obj);
		for(int i=0;i<obj.size();i++) {
			System.out.println(obj.get(i));
		}
	}

}
