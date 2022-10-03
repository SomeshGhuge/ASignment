package Assignemnt18;

//2. Suppose you have array that containing elements 10,20,30,10, 30,50,60 
//Find out duplicate elements into array and print it.

public class Problem2 {
	public static void main(String[]args) {
			    	int[] a = { 10, 20, 30, 10, 30, 50, 60 }; // array declared and initialised
					
					System.out.println("Duplicate numbers are>> ");
					for (int i = 0; i < a.length; i++) {
						
					for (int j = 1+i; j < a.length; j++) {
					

					if (a[i] == a[j]) { // check one element to remaining next other element for duplicacy
					
					System.out.println(a[i]); // Printing the duplicate numbers
					
				}
			}
			
		}
	}

}
