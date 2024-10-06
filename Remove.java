package com.Roughf.practise;

import java.util.Arrays;
class Solution02 {
    public int removeElement(int[] nums, int val) {
        int i=0,x=0,k=0,f;
        int []ex=new int[nums.length];
        while(i<nums.length){
            if(!(nums[i]==val)){
                ex[i]=nums[i];
                k++;
            }else{
            	f=0;
                while(f==0){
                    if(nums[nums.length-x-1]!=val){
                    ex[i]=nums[nums.length-x-1];
                    nums[nums.length-x-1]=10;
                    x++;f=1;
                }
                }
            }
            i++;
        }
        //Arrays.sort(ex);
        System.out.println(Arrays.toString(ex));
        return k;
    }
} 
public class Remove extends Solution02 {
	int []nums = {1,2,3,4,2,5,9,6};
	   /* public int removeElement(int[] nums, int val) {
	        Arrays.sort(nums,0,nums.length);
	        int x=0,y=0,c=0;
	        while(x<nums.length) {
	        	if(nums[x]==val) {
	        		nums[x]=Integer.MAX_VALUE;
	        		c++;
	        	}
	        	x++;
	        }
	        Arrays.sort(nums,0,nums.length);
	        Arrays.fill(nums,nums.length-c,nums.length,-1);
	        System.out.println(""+Arrays.toString(nums));
	        for(int i:nums) {
	        	y++;
	        	System.out.print(" "+i);
	        	if(y==nums.length-c)break;
	        }
	        return nums.length-c;
	    }*/
	    public static void main(String[] args) {
	    	Remove r = new Remove();
			System.out.println( "\n  "+r.removeElement(r.nums, 2));
		}
	}


/*
 * class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums,0,nums.length);
        int x,y,c=0;
        x = nums.length/2;
       if(nums[x]<=val){
         while(nums[x]<=val){
            y=x;
            if(nums[x]==val){nums[x]=0;c++;}
            x=((y+1)+nums.length)/2;
        }
       }else{
        while(nums[x]>=val){
            y=x;
            if(nums[x]==val){nums[x]=0;c++;}
            x=(y-1)/2;
        }
        }
        System.out.println(""+Arrays.toString(nums));
        return nums.length-c;
    }
}
*/
