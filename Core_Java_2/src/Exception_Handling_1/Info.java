package Exception_Handling_1;
//package Exception_Handling;
//
//public class Info {
//	
//	Exception is abnormal condition that occurs during execution of program to stop the entire
//	flow of program called as Exeception.
//	
//	Exception handling is the powerfull program which is used to handle runtime errors so that
//	normal flow of application can be maintained.
//	
//	It is highly recommended to handle exceptions. The main objective of exception handling is normal (graceful) termination of the program.
//	Exception handling doesn't mean repairing an exception. We have to define alternative way to continue rest of the program normally. This way of defining alternative is nothing but exception handling
//
//	
//	Default Exception Handling: 
//		Whenever inside a method, if an exception has occurred, the method creates an Object
//		known as an Exception Object and hands it to JVM. 
//		The exception object contains following information: 
//			
//		1)	the name and description of the exception 
//		2)	the location of exeption.
//
// Creating the Exception Object and handling it in the JVM is called throwing an Exception. 
//		           
//		The run-time system searches the call stack to find the method that contains a
//		block of code that can handle the occurred exception. The block of the code
//		is called an Exception handler.
//		
//		The JVM starts searching from the method in which the exception occurred,
//		and proceeds through the call stack in the reverse order in which methods 
//		were called.
//		
//		If it finds an appropriate handler, then it passes the occurred exception to it.
//		An appropriate handler means the type of the exception object thrown matches
//		the type of the exception object it can handle.
//		
//		If the run-time system searches all the methods on the call stack and couldn’t 
//		have found the appropriate handler, then the run-time system handover 
//		the Exception Object to the default exception handler, which is part of the 
//		run-time system. 
//		
//		This handler prints the exception information in the following format and terminates
//		the program abnormally.
//
//	
//	
//	Throwable------>
//		
//		In the above given Hierarchy Throwable is a class which is at 
//	the top of the exception hierarchy, from which all exception classes are derived.
//	
//		It is the super class of all Exceptions in Java.
//	
//		Both Exception and Errors are java classes which are derived from the Throwable class.
//	
//	Error----->
//	
//		Error is subclass of throwable class.
//		Errors are mostly the abnormal conditions.
//		Error does not occur because of the programmer’s mistakes,
//	but when system is not working properly or a resource is not allocated properly.
//		Memory out of bound exception, stack overflow etc., are examples of Error.
//	
//	
//	Difference between Checked and Unchecked Exceptions---->
//	
//	1) Checked Exception----->
//	
//	The classes which directly inherit Throwable class except RuntimeException
//	and Error are known as checked exceptions 
//	The exceptions which are checked by the compiler whether programmer
//	handling or not, for smooth execution of the program at runtime, are called
//	checked exceptions.
//	
//	Example-
//	IOException
//	SQLException 
//	
//	
//	2) Unchecked Exception---->
//	
//	The classes which inherit RuntimeException are known as unchecked exceptions.
//	Unchecked exceptions are not checked by the compiler whether programmer handing 
//	or not, but they are checked at runtime. 
//
//          Example-
//                 ArithmeticException-

//3) Error---->
//     Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, 
//      AssertionError etc.



//finally---->

//The finally block is used when an important part of the code needs to be executed.
//It is always executed whether or not the exceptions are handled.
//	Finally block will always get executed until we shut down JVM. 
//To shut down JVM in java we call System.exit (). If you write this 
//in try block in that case finally block will not be executed.
//	Normally, finally block contains the code to release resources 
//like DB connections, IO streams etc

//}
