package Exception_Handling_1;

public class Finally {
	int m1() {
		  try {
		    return 10;
		  } catch (Exception e) { 
		      return 20;
		  } finally { 
		      return 30;
		  }
		  }
	public static  void main(String[] args) {
	  Finally f =new Finally ();
		System.out.println(f.m1());
	}}