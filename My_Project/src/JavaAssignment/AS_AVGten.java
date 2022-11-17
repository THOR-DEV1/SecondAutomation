package JavaAssignment;

public class AS_AVGten {

	public static void main(String[] args) {
		int []num= {1,2,3,4,5,6,7,8,9,10};
		float sum=0;
		int i=0;
		while(i<num.length) {
			sum+=num[i];
			i++;
		}
		float avg=(sum/num.length);
		System.out.println("Sum:"+avg);

	}

}
