package Numbers;

public class Duplicate_number_in_Array {
	public static void main(String[]args) {
    	int[] a = { 10, 20, 30,  50,30,10, 60 }; // array declared and initialised
	
		System.out.println("Duplicate numbers are>> ");
		for (int i = 0; i < a.length; i++) {
			
		for (int  j = i+1; j < a.length; j++) {
		

		if (a[i] == a[j]) { // check one element to remaining next other element for duplicacy
		
		System.out.println(a[i]); // Printing the duplicate numbers
		
	}
}

}
}

}
