package com.Roughf.practise;
import java.util.Arrays;
public class Remove_ele {
	static int []A = {1,2,3,2,3,4,2,5};
     public static int remove(int[] n, int val) {
		@SuppressWarnings("unused")
		int i=0,j=0,c=0;@SuppressWarnings("unused")
		boolean swap;
    	 while(i<n.length) {
			if(n[i]==val) {
				n[i]=Integer.MAX_VALUE;
				c++;	
			}i++;
		}i=0;
		System.out.println(""+Arrays.toString(n));
		/*for(i=0;i<n.length-1;i++) {
			swap=true;
			for(j=0;j<n.length-i-1;j++){
					if(n[j]>n[j+1]) {
						int t = n[j];
						n[j]=n[j+1];
						n[j+1]=t;
						swap = false;
					}
			      }
			if(swap) {
				break;
			}
		}*/
		return n.length-c;
    	
    }
	public static void main(String[] args) {
		int k = remove(A,2);
		System.out.println(""+k);
		Arrays.sort(A, 0, A.length);
		Arrays.fill(A,5,A.length,0);
		System.out.println(""+Arrays.toString(A));
	}

}
