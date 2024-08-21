package jlab;

public class Practice2 {

	public static void main(String args[]) {
//		int a =10;
//		int b =20;
//		System.out.println("main");
		Practice2 p=new Practice2();
		//p.show();
		//print();
	}
	Practice2()
	{
		int a =10;
		System.out.println("constructor");
	}
	static void print()
	{
		//int a =10;
		System.out.print("print");
	}
	void show()
	{
		int a =10;
		System.out.print("show");
	}
	static
	{
		System.out.println("static");
	}
	{
		System.out.println("non-static");
	}

}
