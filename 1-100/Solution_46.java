package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Permutations
 * 无重复数字全排列组合
 * 递归实现全排列
 * @author topdc
 *
 */
public class Solution_46 {
	public List<List<Integer>> ret =new ArrayList<List<Integer>>();
	
	 public List<List<Integer>> permute(int[] nums) {
		 quanpai(nums,0,nums.length-1);
		
		 return ret;
	        
	 }

	 public void quanpai(int []nums , int from,int to){
		 if(from==to){
			 List<Integer> r=new ArrayList<Integer>();
			 for (int i : nums) {
				r.add(i);	
			 }
			 ret.add(r);
		 }
		 
		 else{
			 for(int i=from;i<=to;i++){
				 //递归返回
					swap(nums,from,i);
					quanpai(nums,from+1,to);
					swap(nums,from,i);
				}
		 }
	 }
	 public void swap(int []nums,int i,int j){
		 int tmp=nums[i];
		 nums[i]=nums[j];
		 nums[j]=tmp;
	 }
	 

}
