package com.Roughf.practise;

import java.util.Arrays;

class Approch_1{
	int c=0;
    int size,ele;
	int []a1;
	public void setSize1(int size,int ele) {
		this.size = size;
		this.ele=ele;
	}
	public void setA1(int[] a1) {
		this.a1 = a1;
	}
	public void Linear() {
		int i=0;boolean flag=true;
		while(i<a1.length) {
			if(a1[i]==ele) {
				flag=false;
				System.out.println("Body Found At Index "+i);
			}
			i++;
		}if(flag) {
			System.out.println("Body Not Found ");
		}
	}
	public int getSize1() {
		return size;
	}
	public String getA1() {
		return Arrays.toString(a1);
	}
	
}
class Approch_2 extends Approch_1{
	int size;
	static int s=-1;
	int ele;
	int []a2=new int[size];
	public void setSize2(int size,int ele) {
		this.size = size;
		this.ele=ele;
	}
	public void setA2(int[] a2) {
		this.a2 = a2;
	}
    public void Binary() {
    	int start=0,end=a2.length-1,m=(start+end)/2;boolean flag=true;
    	System.out.println(Arrays.toString(a2));
    	//System.out.println(""+m+"   "+a2[m]);
    	Arrays.sort(a2);//| | | | | | |
    	System.out.println(Arrays.toString(a2));
    	//System.out.println(Arrays.binarySearch(a2, 7));;
	while(start<=end) {
			if(a2[m]==ele) {
				flag=false;
				System.out.println("Body Found At Index "+(m));    
				int t=m;
				if(m!=end){
					if(t<end-1) {
						a2[t]=a2[t-1];
						Binary();
					}
					//System.out.println(Arrays.toString(a2));
				}
				break;
			}else if(ele>a2[m]) {
				//System.out.println("1");
				start=m; 
			}else if(ele<a2[m]){
				//System.out.println("Body Found At Index "+(s+1));
				//System.out.println("2");
				end=m-1;
			}
			m=(start+end)/2;
		}if(flag) {
			System.out.println("Body Not Found ");
		}
	}
	public int getSize2() {
		return size;
	}
	public String getA2() {
		return Arrays.toString(a2);
	}
}
class Rough extends Approch_2{
	public int birecursion(int s,int e,int v) {
		Arrays.sort(a2);
		if(s<=e) {
			int m=(s+e)/2;
			if(a2[m]==v) {
				//System.out.println(m);
				c++;
				System.out.println(c);				
			}if(a2[m]<=v) {
				birecursion(m+1,e,v);
			}if(a2[m]>=v) {
				birecursion(s,m-1,v);
			
			}
		}
		return -1;
	}
}
public class Search extends Rough {
	public static void main(String[] args) {
		Search s =new Search();
		s.setSize1(7,5);
		s.setA1(new int[]{1,2,3,4,5,6,7});
		s.setSize2(7,7);
		s.setA2(new int[]{7,7,8,7,9,7,7});
		//s.Linear();
		//s.Binary();
		s.birecursion(0,6,7);
		//System.out.println(s.getA1());
		//System.out.println(s.getA2());
	}

}
