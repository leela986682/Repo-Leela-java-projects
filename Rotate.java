package com.Roughf.practise;

import java.util.Arrays;

public class Rotate {
	
	int []a= {0,1,2,3,4,5,6,7,8,9,12,13,12,1,2,13,1,41,15,16,17,18,100,18,99,88,77,66,54,46,65,7};
	 
   public void reverse(int []a,int s,int e) { 
	{
		  int i = s;
		  while(s<=e) {
			  int t = a[s];
			  a[s]  = a[e];
			  a[e]  = t;
			  s++;
			  e--;
		  }
		  
	 }
   }
   public void rotate_02(int []a,int k) { 
		{
			reverse(a,a.length-k,a.length-1);
			{
				while(k!=0) {
					int t = a[a.length-k];{
						rotate_01(a,t,k);
						k--;
					}
				}
			}
		}
	   }
   
	private void rotate_01(int[] a2, int t,int k) {
	int i=a.length-k;
		while(i>0) {
		int t1 = a[i];
		a[i]=a[i-1];
		a[i-1]=t1;
			i--;
	}a[0]=t;
	
}
	public static void main(String[] args) {
	Rotate r = new Rotate();
	//r.rotate_01(r.a,0,r.a.length,3);
	//new Static();
	r.rotate_02(r.a,9);
	System.out.println(Arrays.toString(r.a));
	}
	

}
