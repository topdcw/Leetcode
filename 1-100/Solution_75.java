package com.dcw.leetcode;

import java.util.Arrays;

/**
 * Sort Colors
 * Given an array with n objects colored red, white or blue,sort them so that 
 * objects of the same color are adjacent,with the colors in the order red, white and blue.
 * @author dong
 *
 */
public class Solution_75 {
	
	public void sortColors(int[] nums) {
		if(nums.length<=1)
			return;
		int from=0;
		int now=0;
		int to=nums.length-1;
		while(from<to&&now<=to){
			if(nums[now]==0){
				nums[now]=nums[from];
				nums[from]=0;
				from++;
				now++;
			}
			else if(nums[now]==2){
				nums[now]=nums[to];
				nums[from]=2;
				to--;
			}
			else
				now++;
		}
    }
	public static void main(String[] args) {
		
	}
}
