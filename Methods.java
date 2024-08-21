/*
 *  method is a block of code or collection of statements 
 *  or a set of code grouped together to perform a certain task or operation
 *  It is used to achieve the reusability of code. 
 *  We write a method once and use it many times. 
 *  We do not require to write code again and again. 
 *  It also provides the easy modification and 
 *  readability of code, just by adding or removing a chunk of code. 
 *  The method is executed only when we call 
 */


package jlab;


public class Methods {
	
	static int mul=1;
	
	
	int a = 5;
	 
	int b = 5;
	
	
	public static void main(String []args) {//main method (static)
		
		
		System.out.println("choose method to do specific task:");
		
		
		/* className obj = new(Key Word) CallingClass();//instance 0r referenced */
		   
		   Methods   obj = new           Methods();
		
		   
		obj.a = 6;
		
		obj.b = 3;
		
		int c = add(obj.a,obj.b);    /*static block we can access directly*/
		
		int x = obj.a;
		
		
		obj.sub(x,obj.b);/*non static we need to creat object to call this block*/

		
		int y = obj.b;
		
		new Methods().mul(x,y);

		
		
		
		Methods.div(mul,y);

		
		
		
	}
	public static int add(int a , int b) {
		  
		return a+b;
		
	}

	

	private void sub(int a , int b) {
		  
		int c = a-b;
		System.out.println("the sub is "+c);
		
		
	}
	
	protected void mul(int a , int b) {
		
		mul=a*b;
		
	}
	
	
	public static void div(int a , int b) {
		
		int div = a/b;
		
		System.out.println("the sub is "+div);
		
	}

	
}
