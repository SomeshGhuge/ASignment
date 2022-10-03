package Assignemnt07;

//4. Design method public int getReverseNumber(int num)
//which return int value to that method and result print into main method.
//(Enter the no=125 then output will be 521

public class Assignment7_4 {
public static void main(String[]args) {
			int a = 125,c=0;
		while(a!=0) {
			// This is the formula for reverse order
			int b=a%10;
			c=(c*10)+b;
			a=a/10;
		}
		System.out.println("Given number"+c);
		}

}
