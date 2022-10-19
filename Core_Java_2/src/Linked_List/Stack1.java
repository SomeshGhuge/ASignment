package Linked_List;
/*
Stack-
The stack is a linear data structure that is used to store the collection of objects.
1.	It is the child interface of vector.
2.	It is specially design the class for Last In First Out (LIFO or FILO)

Constructor
Stack s= new Stack();


Methods-

1.	Object push(Object obj);
         For inserting an object to stack.

2.	Object pop();
          To remove the return top of stack.

3.	Object peek();
          To return the top of stack without removal of object.

4.	int Search(Object obj);
           if specified object is available it returns its offset from top of stack. If object is not available then it return -1.
*/

import java.util.Stack;
import java.util.Vector;
public class Stack1 {
   public static void main(String args[]) {
        Stack stack = new Stack();
		stack.push("J");
		stack.push("M");
		stack.push("K");
        System.out.println(stack);
		System.out.println(stack.search("X"));
		//if element not found then return -1
		//if element found then return 1
	}}
