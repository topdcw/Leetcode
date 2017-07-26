package com.dcw.leetcode;

/**
 * Rotate Array
 * Rotate an array of n elements to the right by k steps.
 * 右移k个单位。超过的部分置于数组的前面。
 * 例如：1234567  3  =》 5671234
 * 也就是说当k=nums.length时不发生任何移动。
 * k>nums.length等效于k=k%nums.length;
 * 使用三步翻转法
 * @author dong
 *
 */
public class Solution_189 {
	public void rotate(int[] nums, int k) {
		k=k%nums.length;
		//三步反转
		fanzhuan(nums, 0, nums.length-k-1);
		fanzhuan(nums,nums.length-k,nums.length-1);
		fanzhuan(nums,0,nums.length-1);
		
		
    }
	
	private void fanzhuan(int[]nums,int from,int to){
		int tmp;
		while(from<to){
			tmp=nums[from];
			nums[from++]=nums[to];
			nums[to--]=tmp;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
