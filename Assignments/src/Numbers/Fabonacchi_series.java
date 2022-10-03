package Numbers;

// 0,1,1,2,3,5,8....upto 20
public class Fabonacchi_series {
	public static void main(String[]args) {

		int a=0;
		int b=1;
		int c;
		for(int i=1; i<=10; i++) {
		   c=a+b;
		   System.out.print(" "+c);
		   a=b;
		   b=c;
		}
		
		
	}

}
