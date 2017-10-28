package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Subsets
 * Given a set of distinct integers, nums, return all possible subsets.
 * 
 * 
 * @author topdc
 *
 */
public class Solution_78 {
	
	private List<List<Integer>> ret=new ArrayList<List<Integer>>();
	
	public List<List<Integer>> subsets(int[] nums) {
		ret.add(new ArrayList<>());
		List<Integer> tmp=new ArrayList<>();
		for(int i=1;i<=nums.length;i++){//每种组合
			 zuhe(tmp,nums,0,i);
			 
		}
		 
		return ret;
		 
	}
	private void zuhe(List<Integer> tmp,int[]nums,int loc,int len){
		if(len==0){
			ret.add(new ArrayList<>(tmp));
			System.out.println(tmp);
		}
		else{
			for(int i=loc;i<=nums.length-len;i++){
				tmp.add(nums[i]);
				zuhe(tmp, nums, i+1, len-1);
				tmp.remove(tmp.size()-1);
			}
		}
		
	}
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Solution_78()).subsets(new int[]{1,2,3});
		System.out.println("123");
	}

}
