package jlab;
import java.util.*;
public class Tester {

	static{
		System.out.println("Enter the question name to execute:");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String q = sc.nextLine();
		if(q.equalsIgnoreCase("Voter")){
			Person ob = new Person();
			ob.setDetails(22,"leela");
			ob.Show();
			if(ob.getDetails()<19) {
				System.out.println("not eligible");
			}else System.out.println("eligible");
		}
		if(q.equalsIgnoreCase("Employee")){
			Employee ob = new Employee();
			ob.setter("leela","Java",150000,true);
			ob.getter();
		}
		if(q.equalsIgnoreCase("Employee")){
			Employee ob = new Employee();
			ob.setter("leela","Java",150000,true);
			ob.getter();
		}
		if(q.equalsIgnoreCase("GradeCal")){
			Grade_Cal ob = new Grade_Cal();
			ob.setter("leela",15,95);
			ob.getter();
		}
	}

}
