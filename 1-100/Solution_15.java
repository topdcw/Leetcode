package com.dcw.leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;;

/**
 * 3Sum
 * 转化为2sum求解，将复杂度降低到O(n^2)
 * 对数组操作一定小心越界。
 * @author topdc
 *
 */
public class Solution_15 {
	List<List<Integer>> ret;
	
	public Solution_15(){
		ret=new ArrayList<List<Integer>>();
	}
	public List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3)
			return ret;
		
		Arrays.sort(nums);//升序排列
		//寻找时，先确定一个值tmp，再从剩余值中找到两个和为目标值target-tmp的两个数。
		//
		int i=0;
		while(i<nums.length-2){//循环到倒数第三个数结束
			//while(i>0&&i<nums.length-2&&nums[i]==nums[i-1])
			//	i++;//重复的不再计算。
			if(i>0&&nums[i]==nums[i-1]){
				i++;//重复的不再计算。
				continue;
			}
			find_2sum(i+1,nums.length-1,nums,nums[i]);
			i++;
		}
		return ret;
		
    }
	
	
	/**
	 * 在i+1到length-1之间找target的两个数，这样做避免重复。
	 * 因为是按序排列的，如果再重头寻找，可能会找到原本已经找到的元素组，导致重复。
	 * @param l
	 * @param r
	 * @param nums
	 * @param target
	 */
	public void find_2sum(int l,int r,int[]nums,int tmp){
		while(l<r){
			if(nums[l]+nums[r]+tmp==0){
				List<Integer> arr=new ArrayList<Integer>();
				arr.add(tmp);
				arr.add(nums[l]);
				arr.add(nums[r]);
				ret.add(arr);
				while(l<r&&nums[l+1]==nums[l])
					l++;
				while(l<r&&nums[r-1]==nums[r])
					r--;
				l++;
				r--;
			}
			else
    			if(nums[l]+nums[r]+tmp>0)
	    			r--;
	        	else
	        		if(nums[l]+nums[r]+tmp<0)
			        	l++;
		}
		
	}
}