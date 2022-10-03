package Numbers;

public class Missing_number_in_Array {
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
