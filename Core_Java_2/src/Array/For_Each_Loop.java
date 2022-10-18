package Array;
/*
For-each Loop for Java Array

We can also print the Java array using for-each loop. 
The Java for-each loop prints the array elements one by one.
It holds an array element in a variable, then executes the body of the loop.

The syntax of the for-each loop is given below:
for(data_type variable:array){  
           //  body of the loop  
}  
*/
//Java Program to print the array elements using for-each loop  


		public class For_Each_Loop{  
				public static void main(String args[]){  
				    int arr[]={10,20,30,40};  
				
				 //printing array using for-each loop  
				    
				       for(int i:arr)  
				        System.out.println(i);  
				}
		}  

