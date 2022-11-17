package JavaExamples;

public class Ex_TwoDArray {

	public static void main(String[] args) {
		int a[][]=new int[2][2];//declaration and instantiation  
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
				
		for(int i=0;i<2;i++) {//rows
			for(int j=0;j<2;j++) {//cols
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
			System.out.println();
		}

	}

}
