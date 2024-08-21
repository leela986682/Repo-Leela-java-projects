package jlab;

public class PerPow {
	
	
	public static int perfectPower(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i*i*i==n)
			{
				return i;
			}
		}
		return 0;
		
	}
   public static void main(String[] args) {
	   
	 int res=  perfectPower(125);//5*5*5
	 
	 System.out.println(res);
   }
}

