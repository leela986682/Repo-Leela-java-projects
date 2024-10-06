package com.Roughf.practise;
import java.util.*;
class Solution01 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        boolean swap;
        int []nums3=new int[m+n];
        for(int i=0;i<m;i++){
            nums3[i]=nums1[i];
        }for(int i = 0;i<n;i++){
            nums3[m+i]=nums2[i];
        }
        System.out.println("-------------------------------");
         System.out.println(""+Arrays.toString(nums3));
         for(int i=0;i<m+n-1;i++){
            swap = true;
            int j;
            for(j=0;j<m+n-i-1;j++){
                if(nums3[j]>nums3[j+1]){
                    int t = nums3[j];
                    nums3[j] = nums3[j+1];
                    nums3[j+1] = t;
                    swap = false;
                }
            }if(swap){
                break;
            }
            System.out.println(""+Arrays.toString(nums3));
        }
    }
}
public class Sorting_1d extends Solution01{
private static int []Arr = {64,34,25,12,22,11,90};
private static int []Brr = {63,33,24,11,21,10,89};
static int []nums1 = {1,2,3,0,0,0};
static int []nums2 = {2,5,6};
	public static void main(String[] args) {
		print();
		sort(Arr);
		sort(Brr);
		System.out.println("After sorting");
		print();
		System.out.println("After merging");
		Display();
		 int m = 3;
		 int n = 3;
		 Solution01.merge(nums1,m,nums2,n);
	}

	private static void Display() {
		System.out.println(""+Arrays.toString(Merg(Arr,Brr)) );
	}
	private static int [] Merg(int[] a, int[] b) {
		int Crr [] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			Crr[i] = a[i];
		}for(int j=0;j<b.length;j++) {
			Crr[a.length+j]=b[j];
		}
		sort(Crr);
		return Crr;
		
	}
	private static void sort(int []A) {
		boolean swap;
		for(int i=0;i<A.length;i++) {
			swap = false;
			for(int j=0;j<A.length-i-1;j++) {
				if(A[j]> A[j+1]) {
					int t = A[j];
					A[j]=A[j+1];
					A[j+1]=t;
					swap = true;
				}
			}
			if(!swap) {
				break;
			}
			
		}
		
	}
	private static void print() {
		System.out.println("1 st array is"+Arrays.toString(Arr));
		System.out.println("2 nd array is"+Arrays.toString(Brr));
		
	}
}

