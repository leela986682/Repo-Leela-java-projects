package com.Roughf.practise;
/*
 * Implement a Java program that simulates various car-related exceptions 
 * using custom exception classes (CarStopped, CarPuncture, CarHeat). 
 * The program should handle different scenarios and test cases using the
 *  CarTest class and demonstrate exception handling through static methods.
=================================================
For CarStoppedException: extends Exception
Purpose: Represents an exception when the car stops for reasons other than puncture or overheating.

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter
===================================================
For CarPunctureException: extends Exception
This class is used for raise the exception if car is punctured.
Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter
===============================================
For CarHeatException: extends Exception
This class is used for raise the exception if the car engine is more than 50 degrees Celsius

Instance Methods:
No Instance methods

Methods:
Parameterized Constructor with String as parameter
=====================================================================================================================
For CarTest class:
Contains static methods to simulate car operations and throw exceptions based on certain conditions.

Instance Variables:
No Instance Variables

Methods:
Stop(String): void: static

This class throws CarStoppedException. If the string is  stop  
throw new exception and get the message or else message is Car not stall


Methods:
puncture(String): void: static: public

This class throws CarPunctureException. If the string is  
puncture  throw new exception and get the message line  Car is punctured  or else message is Car not stall.

Methods:
carHeat(int): void: static : public

This class throws CarHeatException. If the car heat is more than 50 degrees calicoes it throw 
new exception and get the message line  Car is heated more the 50 degrees  or else message is Car not stall.
======================================================================================================================
ELC class CarUser :-
Invoke stop, puncture, and carHeat methods with appropriate messages or temperatures to test different scenarios.
Ensure that exceptions are properly thrown and caught where applicable.


Test Cases for Car Exceptions
----------------------------------
Car Stopped Exception Test:
Action: Invoke CarTest.stop("stop").
Expected Output: Should throw CarStoppedException with message "Car stopped for some reason."

Car Not Stalled Test:
Action: Invoke CarTest.stop("go").
Expected Output: Should print "Car not started."

Car Puncture Exception Test:
Action: Invoke CarTest.puncture("puncture").
Expected Output: Should throw CarPunctureException with message "Car is punctured."

Car Not Punctured Test:
Action: Invoke CarTest.puncture("move").
Expected Output: Should print "Car not punctured."

Car Overheating Exception Test:
Action: Invoke CarTest.carHeat(60).
Expected Output: Should throw CarHeatException with message "Car is heated more than 50 degrees Celsius."

Car Temperature Normal Test:
Action: Invoke CarTest.carHeat(40).
Expected Output: Should print "Car temperature normal."
//============================================================================================================================================================================================================================
class Carstopped extends Exception{

	public Carstopped(String string) {
		super(string);
		
	}

	
}
class Carpunctured extends Exception{

	public Carpunctured(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class Caroverheated extends Exception{
	public Caroverheated(String message) {
		super(message);
			
	}
}
class Car_test {

	public void stop(String string) {
		// TODO Auto-generated method stub
		new Carstopped(string);
	}

	
	
}



public class Caruser {
	public static void main(String[] args) throws Exception {
		try {
			Car_test ct =new Car_test();
			ct.stop("stop");
		}catch(Exception e){
			System.out.println("exception");
			throw  new Exception("carStopped");
		}
	}
}*/
//Class for testing various car-related exception scenarios
//Class for testing car conditions and throwing custom exceptions
//Custom exception for CarStoppedException
//class CarStoppedException extends Exception {
// public CarStoppedException(String message) {
//     super(message);
// }
//}
//
////Custom exception for CarPunctureException
//class CarPunctureException extends Exception {
// public CarPunctureException(String message) {
//     super(message);
// }
//}
//
////Custom exception for CarHeatException
//class CarHeatException extends Exception {
// public CarHeatException(String message) {
//     super(message);
// }
//}
//


class CarTest extends Exception {

 // Static method to simulate car stop and throw CarStoppedException
 public static void stop(String action) throws Exception {
     if ("stop".equalsIgnoreCase(action)) {
         throw new Exception("Car stopped for some reason.");
     } else {
         System.out.println("Car not stalled.");
     }
 }

 // Static method to simulate car puncture and throw CarPunctureException
// public static void puncture(String action) throws CarPunctureException {
//     if ("puncture".equalsIgnoreCase(action)) {
//         throw new CarPunctureException("Car is punctured.");
//     } else {
//         System.out.println("Car not punctured.");
//     }
// }
//
// // Static method to simulate car heat and throw CarHeatException
// public static void carHeat(int temperature) throws CarHeatException {
//     if (temperature > 50) {
//         throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
//     } else {
//         System.out.println("Car temperature normal.");
//     }
 //}
}

public class CarUser {
 public static void main(String[] args) {
     // Test Case 1: Car Stopped Exception
     try {
         CarTest.stop("stop");
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }

     // Test Case 2: Car Not Stalled
//     try {
//         CarTest.stop("go");
//     } catch (CarStoppedException e) {
//         System.out.println(e.getMessage());
//     }
//
//     // Test Case 3: Car Puncture Exception
//     try {
//         CarTest.puncture("puncture");
//     } catch (CarPunctureException e) {
//         System.out.println(e.getMessage());
//     }
//
//     // Test Case 4: Car Not Punctured
//     try {
//         CarTest.puncture("move");
//     } catch (CarPunctureException e) {
//         System.out.println(e.getMessage());
//     }
//
//     // Test Case 5: Car Overheating Exception
//     try {
//         CarTest.carHeat(60);
//     } catch (CarHeatException e) {
//         System.out.println(e.getMessage());
//     }
//
//     // Test Case 6: Car Temperature Normal
//     try {
//         CarTest.carHeat(40);
//     } catch (CarHeatException e) {
//         System.out.println(e.getMessage());
//     }
 }
}

