package com.Roughf.practise;

import java.util.Arrays;

interface FW{
	abstract void For(int []a);
	abstract void While(int []b);
}
class Array_Attributes{
	public  int []A= {1,2,3,4,5};
	public  int []B= {6,7,8,9,0};
}
public class For_vs_While  extends Array_Attributes implements FW{

	public static void main(String[] args) {
		For_vs_While obj = new For_vs_While();
		Array_Attributes f = new Array_Attributes();
		obj.For(f.A);
		obj.While(f.B);
		//System.out.println(""+Arrays.toString(f.A));
	}
	@Override
	public void For(int []a) {
		for(int i=0;i<a.length;i++) {
			a[i]=B[i];
		}
		System.out.println(""+Arrays.toString(a));
	}

	@Override
	public void While(int []b) {
		int i =0;
		while(i<b.length) {
			b[i]=A[i];
			i++;
		}
		//System.out.println(""+Arrays.toString(A));
		System.out.println(""+Arrays.toString(b));
	}

}
