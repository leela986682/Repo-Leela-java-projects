package com.Roughf.practise;
import java.util.*;
class Solution1 {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                if(nums[nums.length-1-c]!=val) {
                	nums[i]=nums[nums.length-1-c];
                    nums[nums.length-1-c]=Integer.MAX_VALUE;
                    c++;
                }else {
                	nums[nums.length-1-c]=Integer.MAX_VALUE;
                	nums[i]=nums[nums.length-1-c];
                	c++;
                }
            }

        }  
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       return nums.length-c-1; 
    }
} 

public class Roughf extends Solution1{

	public static void main(String[] args) {
		int []nums = new int[]{3,2,2,1,3,7,8,4,3};
		Solution1 s =new Solution1();
		System.out.println(s.removeElement(nums, 3));

	}

}
