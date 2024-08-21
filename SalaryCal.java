/*
  Create a class SalaryCalculation as given:
  Class name:   SalaryCalculation
  Data members/ variables: name,basicPay,specialAllowance,
                  conveyanceAllowance,gross,pf,netSalary,
          AnnualSalary.
 Member functions of class :
 i. void giveValues():  a method to assign details of employee
 ii. void salaryCalculate(): calculate the allowances and salary
                        specialAllowance: 25% of basic salary
            gross: basicpay + specialAllowance + conveyanceAllowance
            pf=8.33% of basicPay
            netSalary=gross-pf
            annualSalary=12 months of salary
iii. void display(): display all the details with suitable message
 */
package jlab;

import java.util.Scanner;

public class SalaryCal {
	static String name;
	static double basicPay;
	static double specialAllowance;
	static double conveyanceAllowance;
	static double gross;
	static double pf;
	static double netSalary;
	static double AnnualSalary;
	public void getValues() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Name of the Employee:");
			name = s.nextLine();
			//s.nextLine();
			System.out.println("Basic pay of the Employee:");
			basicPay= s.nextDouble();
			System.out.println("conveyanceAllowance of the Empolyee:");
			conveyanceAllowance= s.nextDouble();
		}
	}

	public static void main(String[] args) {
		new SalaryCal().getValues();
		new SalaryCal().salaryCalculate();
		new SalaryCal().Display();
	}

	private void Display() {
		System.out.println("\t|THE NAME OF EMPLOYEE "+name+"\n\t|BASIC PAY OF EMPLOYEE "+basicPay+"\n\t|SPECIAL ALLOWANCE "+specialAllowance+"\n\t|CONVEYANCEALLOWANCE "+ conveyanceAllowance+"\n\t|GROSS IS "+gross+"\n\t|PF IS "+pf+"\n\t|NETSALARY IS"+netSalary+"\n\t|AnnualSalary is"+AnnualSalary);
	}

	private void salaryCalculate() {
		System.out.println("allowances and salary");
        specialAllowance = basicPay*(5);
        gross= basicPay + specialAllowance + conveyanceAllowance;
        pf=basicPay*(0.083);
        netSalary=gross-pf;
        AnnualSalary=12* netSalary;
		
	}


}
