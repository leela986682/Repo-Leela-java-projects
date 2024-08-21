/*
 * Que-1
____________
Create a Java program that manages and displays details about a cricket player. Your program should include the following functionalities:

A class named CrickBuzz.
--------------------------
A method named assignDetail that takes the following parameters:
String name: The name of the player.
int totalRun: The total runs scored by the player.
int jersyNo: The jersey number of the player.
int matches: The number of matches played by the player.
String sportsName: The name of the sport. 
String countryName: The name of the country
Inside the assignDetail method:
 Verifications
___________________
|- if the totalRun is greater than zero 
|- if the jersyNo is greater than zero 
|- if the sports name is cricket then only 
   calculate the player's average runs by dividing totalRun by matches.
   Call another method displayDetail() to display the player's details, including the calculated average.
   If sportsName is not "cricket", print "This app is for showing the cricket player details".

A method named displayDetail that takes the following parameters:
String name: The name of the player.
int totalRun: The total runs scored by the player.
int jersyNo: The jersey number of the player.
int matches: The number of matches played by the player.
int average: The average runs scored by the player.
This method should print the player's details in a formatted manner.

A main method that creates an instance of Program04 and calls the assignDetail method with appropriate 
arguments to demonstrate the functionality.

Input as :
assignDetail("virat", 400,18, 5,"cricket");

Output as:
The name of the player :virat
The totalRun of the player :400
The jesryNo of the player :18
The matches played :5
The avergae of the player :80
 **/
package jlab;
import java.util.Scanner;
public class CricBuzz_2024 {

	public static void assignDetail(String n, int T,int J,int  M, String g){
			System.out.println("Player name is:"+n);
			System.out.println("Jersy number is :"+J);
			System.out.println("Total runs scored by player is :"+T);
			System.out.println("Total Matches played by player is :"+M);
			System.out.println("Avg is:"+(T/M));
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String Country = sc.nextLine();
			if(Country.equals("India")||Country.equals("india")) {
				String game = sc.nextLine();
				if(game.equals("circket")){
					String name = sc.nextLine();
					int TRuns = sc.nextInt();
					int JNum = sc.nextInt();
					int Mplay = sc.nextInt();
					assignDetail(name, TRuns,JNum, Mplay,game);
				}else {
					System.out.print("only for circket");
				}
			}else {
				System.out.print("only for india");
			}
		}
		
		}

}
