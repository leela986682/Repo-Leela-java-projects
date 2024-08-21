/*
 * Create a Java class named CBSEResult_In that accepts and processes details of a student and calculates their grade based on their marks in five subjects. The class should contain methods to accept details, calculate the grade, and display the details and the calculated grade.

The method acceptDetailAndSubmit should accept the following parameters:
-------------------------------------------------------------------------
studentName (String): The name of the student.
rollNo (long): The roll number of the student.
schoolRegNo (String): The registration number of the school.
schoolName (String): The name of the school.
gender (char): The gender of the student.
citizenShip (String): The citizenship of the student.
board (String): The education board of the student.

Verification
___________________________________________________________
The program should check if the schoolRegNo is "CBSE01-100",
The citizenShip is "INDIA" (case insensitive),
and the board is "CBSE".
If these conditions are met, it should assign specific marks to the subjects:

If match
---------------------
Math: 90
Science: 85
English: 50
Social Science (sst): 90
Physical Education: 100

And after that it will call the method inside this method name as calculateGrade()
|- having 5 subject marks as parameter 
|- return type char 
|- method type non static 
|- modifier as public 

It should then calculate the average marks and assign a grade based on the following criteria:
----------------------------------------------------------------------------------------------
A: 80 < average <= 100
B: 60 < average <= 80
C: 40 < average <= 60
F: average <= 40

THIS METHOD WILL RETURN BACK THE GRADE TO THE CALLING PLACE AND THEN THE NEXT METHOD WILL ALL THE DETAILS 
OF THE STUDENT AND ALL SUBJECTS MARKS AND WITH THE GRADE WILL BE CALLED WHICH IS NAME AS 
|- DisplayDetails()
   |- Having the parameter as student details ,5 subject marks and grade 
   |- return type will be void 
   |- method type Non static 
   |- modifier as public 


Finally, the program should display the student details, marks, and the grade
If the conditions are not met, it should print an message.

Example
Given the following input:

INPUT AS:
____________________
studentName = "mahi"
rollNo = 00000007
schoolRegNo = "CBSE01-100"
schoolName = "DAV"
gender = 'M'
citizenShip = "INDIA"
board = "CBSE"

The expected output should be:
-------------------------------------------
The name of student : mahi
The rollNo : 7
The schoolRegNo  : CBSE01-100
The SchoolName : DAV
Gender : M
Citizenship : INDIA
Board : CBSE
_____________________________________________
==========Marks=================
                 Math || 90
                 Science || 85
                 English || 50
                 SocialScience || 90
                 PHE || 100
===================================
=============GRADE==================
THE TOTAL MARKS AS GRADE IS  A

-----------------------------------------------------------------
If the conditions are not met, the output should be:

The form submission not accepted
 */
package jlab;
import java.util.Scanner;

public class CBSE_RANK_CARD {
	
	public static char Grade(int a) {
		if(a>=85) {
			return 'A';
		}else if(a>=60) {
			return 'B';
		}else if(a>=50) {
			return 'C';
		}else return 'F';
	}

	public static void RANK_CARD(String n,long r,String s,String g) {
		{
			String x=s.substring(s.length()-2);
			int y = Integer.parseInt(x);
			if(y>01&& y<99 || y==00) {
				int Math= 90;
				int Sci= 85;
				int Eng= 50;
				int sst=90;
				int Phy =100;
				int avg = (Math+Sci+Eng+sst+Phy)/5;
				char gRADE = Grade(avg);
				display(n,r,gRADE);
			}
		}
	}
	public static void display(String n,long r,char gRADE) {
		System.out.print("-------------------------------------------------------------------------------");
		System.out.print("**************************************IOS**************************************");
		System.out.print("********************************CBSE RANK CARD*********************************");
		System.out.print("================================STUDENT DETAILS================================");
		System.out.print("NAME:"+n);
		System.out.print("Roll Number:"+r);
		System.out.print("");
		System.out.print("Grade is "+gRADE);
		System.out.print("-------------------------------------------------------------------------------");
		System.out.print("-------------------------------------------------------------------------------");
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String sclName =sc.nextLine();
			String citizen =sc.nextLine();
			String Board =sc.nextLine();
			if(citizen.equals("INDIA") && Board.equals("CBSE") && sclName.equals("IOS"))
			{
				String stuName = sc.nextLine();
				long rn0 = sc.nextInt();//
				String sclReg =sc.nextLine();//
				String gen =sc.next();//
			RANK_CARD(stuName,rn0,sclReg,gen);
			}else {
				System.out.print("404 Error"+"not found");
			}
		}

	}

}
