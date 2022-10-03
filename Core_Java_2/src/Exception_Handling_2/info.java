//package Exception_Handling_2;
//
//public class info {
//	Throw and Throws
//	Throw-
//	The throw keyword is used to transfer the exception to someone else.
//	“throw” keyword throws the exception explicitly from a method or a block of code
//	It is only used to propagate the unchecked Exceptions. 
//	Sometimes we can create Exception object explicitly and we can hand over to the JVM manually by using throw keyword.
//
//	Example:
//		throw new ArithmeticException (); 
//
//	Throws-
//	Throws keyword is used to declare the exception with method.
//	“throws” keyword is used to propagate the checked Exceptions only.
//	We can use throws keyword to delegate the responsibility of exception handling to the caller method. Then caller method is responsible to handle that exception.
//
//	Important points to remember about throws keyword: 
//
//		throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
//		throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
//		By the help of throws keyword we can provide information to the caller of the method about the exception.
//
//	Example-
//	void m1()throws IOException{  
//	    m2();  
//	} 







//try	------->The "try" keyword is used to specify a block where we will be writing risky code. The try block must be followed by either catch or finally.
//catch  ------>The "catch" block is used to handle the exception. It must be used after try block . we can't use catch block alone. It can be followed by finally block later.
//finally  ---->The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is occurred or not.
//throw  ------>The "throw" keyword is used to throw an exception.
//throws  ----->The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used in method signature.

//
//}
