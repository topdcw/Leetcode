package com.dcw.leetcode;

/**
 * First Missing Positive
 * 把正数n放在第n-1个位置上，这样从第一个位置开始，
 * 如果位置上的数不等于位置号，那么就是第一个缺失的正数
 * @author topdc
 *
 */

public class Solution_41 {

	public int firstMissingPositive(int[] nums) {
		
		int tmp;
		////把小于等于nums.length的正数nums[i]放到第nums[i]-1个位置上  
		for(int i=0;i<nums.length;i++){
			//这个while循环非常重要
			while(nums[i]>0&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
				tmp=nums[nums[i]-1];
				nums[nums[i]-1]=nums[i];
				nums[i]=tmp;
			}
		}
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=i+1){
				return i+1;
			}
		}
		return nums.length+1;
        
    }
}
