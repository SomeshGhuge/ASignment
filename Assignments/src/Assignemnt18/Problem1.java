package Assignemnt18;

// 1. Suppose You have given an integer array containing 1 to n but one of the number 
// from 1 to n in the array is missing. You need to provide optimum solution to
// find the missing number. Number can not be repeated in the array.

// suppose take number in array is {1,2,3,4,5,6,7,8,9,0}
// from that 5 is missing then how u find this ...?
public class Problem1 {
	public static void main(String[]args) {
		int a[]= {1,2,3,6,7,8,4,9,0};
		for(int i=0;i<=a.length;i++) {
            int count=0;
                for(int j=0;j<a.length;j++) {
                     	if(i==a[j]) {

                      		count++;
        	}
        	
        }if(count==0) {
			System.out.println("Your missing number is "+i );
		}
        	}
		}
	}


