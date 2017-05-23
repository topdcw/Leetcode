package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;



/**
 * Permutations 2
 * 有重复数字全排列组合
 * 递归实现全排列
 * @author topdc
 *
 */
public class Solution_47 {
	public List<List<Integer>> ret =new ArrayList<List<Integer>>();
	 public List<List<Integer>> permuteUnique(int[] nums) {
		 quanpai(nums,0,nums.length-1);
		
		 return ret;
	        
	 }

	 public void quanpai(int []nums , int from,int to){
		 if(from==to){
			 List<Integer> r=new ArrayList<Integer>();
			 for (int i : nums) {
				r.add(i);
				System.out.print(i+" ");
			 }
			 System.out.println();
			 ret.add(r);
			
		 }
		 
		 else{
			 for(int i=from;i<=to;i++){
				 //递归返回
				 	if(i>from&&isExsit(nums, from, i))
						continue;
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
	 
	 //用于判断
	 public boolean isExsit(int[]nums,int from,int i){
		 
		 for(int j=from;j<i;j++){
			 if(nums[i]==nums[j])
				 return true;//nums[i]在nums[from]到nums[i-1]中存在
		 }
		 return false;
	 }
	 
	public static void main(String[] args) {
		int[]ch={2,1,2,1};
		Solution_47 t=new Solution_47();
		t.quanpai(ch, 0, 3);
	}

}
