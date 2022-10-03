//package Serialization_Deserialization;
//
//public class info {
//	
//Serialization------->
//    The process of storing the state of objects into file called as serialization.
//
//1. The process of saving (or) writing state of an object to a file is called serialization.
//2. but strictly speaking it is the process of converting an object from java supported form to either network supported form (or) file supported form. 
//3. By using FileOutputStream and ObjectOutputStream classes we can achieve serialization process.
//
//
//De-Serialization:----->
//    process of reading the state of objects from file called as Deserialization.
//    
//1. The process of reading state of an object from a file is called DeSerialization 
//2. but strictly speaking it is the process of converting an object from file supported form (or) network supported form to java supported form. 
//3. By using FileInputStream and ObjectInputStream classes we can achieve DeSerialization
//
//


//Transient keyword: ---->
//
//1. transient is the modifier applicable only for variables. 
//2. While performing serialization if we don't want to save the value of a particular variable to meet security constant such type of variable, then we should declare that variable with "transient" keyword. 
//3. At the time of serialization JVM ignores the original value of transient variable and save default value to the file. 
//4. That is transient means "not to serialize".
//
//Static Vs Transient: ----->
//       static variable is not part of object state hence they won't participate in serialization because of this declaring a static variable as transient there is no use. 
//
//Transient Vs Final:-------->
//      final variables will be participated into serialization directly by their values. Hence declaring a final variable as transient there is no use. //the compiler assign the value to final variable.
//
//Serial Version UID:------->
//	The serialization associated with each serializable class has a version number called Serial Version UID.
//	It is used during de-serialization to verify that the sender and receiver of a serialized object have loaded classes for that and are compatible with respect to serialization.
//
//
//	If the receiver is loaded with different version of a class that has different serial version UIDs than the corresponding sender's class, then de-serialization will result in an invalid Class Exception.
//	A Serializable class can declare its own serial version UID explicitly by declaring a field named serial version UID that must be static, final and of type long.
//e.g. private static final long serialVersionUID = 1L;
//Example -Consider the above same program in which we don't want to serialize the salary of a student

//}
