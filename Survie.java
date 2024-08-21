/*
 Que-1
 
_________________________________________
The program reads the basic salary of an employee from the user using the command line argument,and
by creating the multiple method 

Method 
--------------------
Name : calculateAndPrintGrossSalary
returnType : void
methodType : non static
Parameter:  String name,int id,String address,long adharNumber,String citizenShip,double basicSalary
Verification
____________________________________________________________________________________________________
> If citizenship is Indian then 
> If the adharNumber is of 13 digit 
   |- For that call one method name as countAdharDigit
      return type : boolean 
      method type : non static 
      Parameter : long adharNumber 
      Logic : This method should count the adharaNumber is of 13 digit or not if the adharNumber 
              is of 13 return true otherwise return false.
> If the address is of hyderbad.
____________________________________________________________________________________________________
If ALL THE ABOVE REQUIREMENTS VERIFIY THEN CALL THE METHOD 
Name: calculateSalary
returnType : void
method type : non static 
parameter as : String name,int id,String address,long adharNumber,String citizenShip,double basicSalary

Logic: Calculates HRA and DA based on the given criteria:
       [ Take HRA and DA  as the local variable of the method ]

Basic Salary <= 10000: HRA = 20%, DA = 80%
Basic Salary <= 20000: HRA = 25%, DA = 90%
Basic Salary > 20000: HRA = 30%, DA = 95%

Calculates Gross Salary: Gross Salary = Basic Salary + HRA + DA

Output: Prints the basic salary, HRA, DA, and gross salary directly from this method.
        and also print the detail of the employee
        as name. id, address, adharNumber,citizenShip,basicSalary

Main Method:
Taking the input as command line arguments create the object of the class and then call the
method.
Input as:  String name,
           int id,
           String address,
           long adharNumber, 
           String citizenShip,
           double basicSalary
           */
package jlab;
import java.util.*;
public class Survie {
	static double bS;
	static double Hra;
	static double Da;
	static double Gs;
	static int c;
	static String n;
	public static void main(String[] args) {
		System.err.println("enter basic details as follows name,citizenship,adhar,address,basicSalary,id: ");
		try (Scanner sc = new Scanner(System.in)) {
			System.err.println("enter name");
			String name = sc.nextLine();
			System.err.println("enter citizenship");
			String citizenship = sc.nextLine();
			if(citizenship.equalsIgnoreCase("India")) {
				System.err.println("enter Adhar Number");
				long adhar = sc.nextLong();
				if(count(adhar)) {
					sc.nextLine();
					System.err.println("enter address");
					String add = sc.nextLine();
					if(add.equalsIgnoreCase("hyderbad"))
					{
						//sc.nextLine();
						System.err.println("enter id");
						int id = sc.nextInt();
						System.err.println("enter Basic Salary");
						 bS = sc.nextDouble();
						new Survie();
						Survie.calculateSalary(name,id,add,adhar,citizenship,bS);
					}else {
						System.err.println("sorry! only for telangana");
					}
				}else {
					System.err.println("please! check adhar number");
				}
			}else {
				System.err.println("sorry! only for indians");
			}
		}
		
	}

	private static boolean count(long adhar) {
		long t=adhar;
		while(t!=0) {
			c++;
			t=t/10;
		}
		if(c>=11)return true;
		else return false;
	}

	public static void calculateSalary(String na,int id,String add,long aNum,String cS,double bS) {
		if(bS<=10000) {
			Hra = bS/5;
			Da = bS*0.8;
			Gs=Hra+Da+bS;
			if(na.length()>6){ n = na.substring(0,6);}else { n = na;}
			System.err.println("\t ________________________________");
			System.err.println("\t |The basic salary is"+bS+"\t|\n\t |And HRA is "+Hra+"\t\t|\n\t |DA is "+Da+"\t\t\t|\n\t |And gross salary is"+Gs+"\t|\n\t |as name "+n+"\t\t\t|\n\t |with id"+id+"\t\t\t|\n\t |address is "+add+"\t\t|\n\t |adharNumber is "+aNum+"\t|\n\t |citizenShip "+cS+"\t\t|\n\t |basicSalary "+bS+"\t\t|");
			System.err.println("\t |______________________________|");
		}else if(bS<=20000) {
			Hra = bS/4;
			Da = bS*0.9;
			Gs=Hra+Da+bS;
			if(na.length()>6){ n = na.substring(0,6);}else { n = na;}
			System.err.println("\t ________________________________");
			System.err.println("\t |The basic salary is"+bS+"\t|\n\t |And HRA is "+Hra+"\t\t|\n\t |DA is "+Da+"\t\t\t|\n\t |And gross salary is"+Gs+"\t|\n\t |as name "+n+"\t\t\t|\n\t |with id"+id+"\t\t\t|\n\t |address is "+add+"\t\t|\n\t |adharNumber is "+aNum+"\t|\n\t |citizenShip "+cS+"\t\t|\n\t |basicSalary "+bS+"\t\t|");
			System.err.println("\t |______________________________|");

		}else {
			Hra = bS*(30/100);
			Da = bS*(95/100);
			Gs=Hra+Da+bS;
			if(na.length()>6){ n = na.substring(0,6);}else {n = na;}
			System.err.println("\t ________________________________");
			System.err.println("\t |The basic salary is"+bS+"\t|\n\t |And HRA is "+Hra+"\t\t|\n\t |DA is "+Da+"\t\t\t|\n\t |And gross salary is"+Gs+"\t|\n\t |as name "+n+"\t\t\t|\n\t |with id"+id+"\t\t\t|\n\t |address is "+add+"\t\t|\n\t |adharNumber is "+aNum+"\t|\n\t |citizenShip "+cS+"\t\t|\n\t |basicSalary "+bS+"\t\t|");
			System.err.println("\t |______________________________|");
		}
	}

}