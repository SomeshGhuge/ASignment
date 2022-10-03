package Assignemnt10;
//3. Write java program to check whether number is Armstrong or not
//(A positive number is called armstrong number 
//    if it is equal to the sum of cubes of its digits for example
//      0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.
//                            153 = (1*1*1)+(5*5*5)+(3*3*3)  
//                           where:  
//                            (1*1*1)=1  
//                            (5*5*5)=125  
//                            (3*3*3)=27  
//                           So:  
//                             1+125+27=153)
import java.util.Scanner;

public class  ArmStrongNumber{ 
//Create a method to get status of is number Armstrong or not
public boolean isArmstrongNumber(int input) {
int tempValue = input;
int sum = 0; // initialized the sum variable for addition of cube of digits
while (input != 0) {
int remainder = input % 10; // Getting digit by applying remainder logic
sum = sum + (remainder * remainder * remainder); // sum of all cube of digit
input = input / 10;
}
//return the status of input value.
if (sum == tempValue)
return true;
else
return false;
}
public static void main(String[] args) {
ArmStrongNumber armStrongNumber = new ArmStrongNumber();
Scanner scanner = new Scanner(System.in);
System.out.println("Check the below number is Armstrong or not.");
System.out.println("Enter the number: ");
int value = scanner.nextInt();
//check whether input value is Armstrong or not
if (armStrongNumber.isArmstrongNumber(value))
System.out.println(value + " is armstrong number.");
else
System.out.println(value + " is not armstrong number.");
}
}
