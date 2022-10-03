package Numbers;

public class duplicate_two_array_number {
	public static void main(String[]args) {
    	int[] a = { 10, 20, 30,  50, 60 }; // array declared and initialised
	   int [] j= {10,30,80,30,90,70};
		System.out.println("Duplicate numbers are>> ");
		for (int i = 0; i < a.length; i++) {
			
		for (int  k = 0; k <j.length ; k++) {
		

		if (a[i] == j[k]) { // check one element to remaining next other element for duplicacy
		
		System.out.println(a[i]); // Printing the duplicate numbers
		
	}
}

}
}}
