package com.Roughf.practise;

public class Program_01 {

	public static void main(String[] args) {
	
		int a = 5;
	
		m01(a);
	
		System.err.println(" \n"+a);
		}

	private static void m01(int i)//5 4 3 2 1 0 -1

	{

		System.out.println(i+1);//6 5 4 3 2 1 

		if(i<0) 

		{
	       System.out.println("\t----->\t"+i);
	
			return;
		}//f f

		else
		{
			m01(i-1);
		}

		System.out.println(i+1);	

	}
}
