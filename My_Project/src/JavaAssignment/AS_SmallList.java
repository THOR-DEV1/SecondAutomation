package JavaAssignment;

public class AS_SmallList {

	public static void main(String[] args) {
		int n=5;
		int arr[]= {11,2,3,4,5};
		int min=arr[0];
		int pos=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
				pos=i;
			}
		}
		System.out.println("smallest number "+min+" position "+pos);
	}

}
