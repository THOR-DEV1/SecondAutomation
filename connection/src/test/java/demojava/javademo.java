package demojava;

public class javademo {
	static void h(String d) {
		System.out.println(d+" "+"Welcome");
	}
   static void jax(int c) {
	   System.out.println(c+1);
   }
   static void jax(double z) {
	   System.out.println(z+1);
   }
   
	public static int sum(int k) {
		return (k>0)?k+sum(k-1):0;
	}
	public static void main(String[] args) {
		int x=(int)(Math.random()*101);
		System.out.println(x);
		String s=(x<100)?"small":"large";
		System.out.println(s);
		switch(x) {
		case 1:
			System.out.println("one");
		case 33:
			System.out.println("two");
		default :
			System.out.println("none");
		}
		while(x<100) {
			System.out.println("hello");
			break;
		}
		int y=0;
		do {
			System.out.println(y);
			y++;
		}while(y<100);
		int f=0;
		for(int i=0;i<10;i++) {
			f=f+i;
			
		}
		System.out.println(f);
		String [] i= {"THe","SAI","Dad","Sumanth"};
		for(String o:i) {
			System.out.println(o);
		}
		System.out.println(i[0]);
		System.out.println(i.length);
		h("Sumanth");
		jax(1);
		jax(2.4);
		int r=sum(10);
		System.out.println(r);
	}
	
	

}
