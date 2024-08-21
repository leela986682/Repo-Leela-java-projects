package jlab;

public class Practise1 {
		
	static int a;//0
	
	int b;
		public static void main(String args[]){
		st_meth();
		nonst_meth();
		st_meth_rt();
		nonst_meth_vd();
		}
		public static int st_meth()
		{
		System.out.println("Sonal");
		System.out.println(" "+a);
		System.out.println(" ");
		System.out.println("add is :"+(a+b));
		}
		public  void nonst_meth()
		{
		System.out.println("Sonal");
		System.out.println("add is :"+(a+b));
		}
		public static int st_meth_rt()
		{
		System.out.println("Sonal");
		System.out.println("add is :"+(a+b));

		}
		public  void nonst_meth_vd()
		{
		System.out.println("Sonal");
		System.out.println("add is :"+(a+b));
		
}
