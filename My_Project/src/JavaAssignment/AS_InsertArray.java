package JavaAssignment;

import java.util.Arrays;

public class AS_InsertArray {

	public static void main(String[] args) {
		int[] my_arr= {85,34,45,32,56};
		int index=2;
		int value=5;
		for(int i=my_arr.length;i>index;i--) {
			my_arr[i]=my_arr[i-1];
		}
		my_arr[index]=value;
		System.out.println("new array"+Arrays.toString(my_arr));
	}

}
