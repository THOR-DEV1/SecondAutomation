package JavaAssignment;

public class AS_SmalLargeArray {

	public static void main(String[] args) {
		int arr[]=new int[] {13,43,54,55,12,11};
		int s=arr[0];
		int l=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>l) {
				l=arr[i];
			}
			else if(arr[i]<s) {
				s=arr[i];
			}
		}
		System.out.println("Large number:"+l);
		System.out.println("Small number:"+s);

	}

}
