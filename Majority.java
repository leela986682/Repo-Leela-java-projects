package com.Roughf.practise;

import java.util.Arrays;
/*
public class Majority {
int c;
	public static void main(String[] args) {
		int a[]=new int[] { 1, 3, 2, 3, 3, 2, 3, 4, 3, 4};
		int b[]=new int[] {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		 Majority f = new Majority();
		 System.out.println(Arrays.toString(f.find(a,b)));
		 f.display(a,b);
	}
	private void display(int[] a, int[] b) {int mx=b[0],in=0,i;
		for(i=0;i<a.length;i++) {
			if(b[i]!=-1) {
			System.out.println(a[i]+" repeated "+b[i]+"times");
				if(mx<b[i]) {
					mx=b[i];
					in=i;
					//System.out.println("Majority is"+a[i]+"of"+b[i]+"times");
				}
			}
			
		}
		System.out.println("Majority is "+a[in]+" of "+b[in]+" times.");
		
	}
	public int [] find(int[] a,int[] b) {
		int n = 0;
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			if( i!=0 && (a[i]==a[i-1]))continue;
			else{
				int s=i;
				int e=a.length-1;
				b[i]=binary_Serch(a,s,e,a[i]);
				c=0;
			}
		}
		 //System.out.println(Arrays.toString(a));
		return b;
	}

	private int binary_Serch(int[] a, int s, int e, int i) {
		int m = (s+e)/2;
		if(s<=e) {
			if(a[m]==i) {
				c++;
				//System.out.println(i);
				//a[m]=Integer.MAX_VALUE;
				//Arrays.sort(a);
			}if(a[m]<=i) {
				//Arrays.sort(a);
				 binary_Serch(a,m+1,e,i);
			}if(a[m]>=i) {
				//Arrays.sort(a);
				 binary_Serch(a,s,m-1,i);
			}
		}
		return c;
	}

}
*/
public class Majority {

    int[] a = new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};

    public static void main(String[] args) {
        Majority f = new Majority();
        System.out.println(Arrays.toString(f.a));
        int candidate = f.findCandidate();
        if (f.isMajority(candidate)) {
            System.out.println("Majority element is: " + candidate);
        } else {
            System.out.println("No majority element found.");
        }
    }

    // Step 1: Find the candidate for majority
    private int findCandidate() {
        int count = 0, candidate = -1;
//================================================================
          for (int num =0;num<a.length;num++) 
          {                                                                         //1,3,2,3,3
            if (count == 0) 
            {                                                                       //t,_,_,_,
            candidate = a[num];
            }                                                                        //1,_,_,_,
            if (a[num]==candidate)
            {//t,_,_,_,
                count++;     //1,_,_,_,
            } 
            else
            {         //_,t,t,t,t
                count--;     //_,0,-1,-2,-3
            }
         System.out.println(num+"  "+a[num]+"  "+candidate+"  "+count);
        }
//================================================================
        return candidate;
    }

    // Step 2: Verify if the candidate is actually a majority
    private boolean isMajority(int candidate) {
        int count = 0;
        for (int num : a) {
            if (num == candidate) {
                count++;
            }
        }
        return count > a.length / 2;
    }
}

