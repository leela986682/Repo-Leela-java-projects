package jlab;
import java.util.Scanner;
public class automorphic {
public boolean auto(int a) {
	int x,t;
	
	x=t=a;
	
	double c=0;
	
	while(t!=0)
	{
		c++;
		t=t/10;
	}
	x*= x;
	
	double d=Math.pow(10,c);
	
	int r= x%(int)d;
	
		    if(r == a){
			return true;
		    }
		    else return false;
	}
	public static void main(String[] args) {
		
		System.out.println("enter the number : ");
		
		automorphic ob = new automorphic();
		
		try(Scanner sc = new Scanner(System.in))
		{
			
			int a = sc.nextInt();
			//System.out.print(a);
			
			if(ob.auto(a)==true)
			
				System.out.print("Automorphic");
			else 
				System.out.print("Not A Automorphic");
		}
		
	}

}
