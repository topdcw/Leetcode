package com.dcw.leetcode;

public class Solution_674 {
	public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
        	return 0;
		int res=1;
		int count=1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]<nums[i+1]){
				count++;
				res=count>res?count:res;
			}
			else{
				count=1;
			}
		}
		return res;
        
    }
}
