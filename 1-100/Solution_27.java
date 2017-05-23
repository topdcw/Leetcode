package com.dcw.leetcode;

/**
 * Remove Element
 * 创建一个count,初始为0，表示当前空位置,也是实际个数
 * 如果nums[i]！=val时，存入nums[count]中，count++;表示新的空位置。
 * @author topdc
 *
 */
public class Solution_27 {
	public int removeElement(int[] nums, int val) {
		
		int count=0;
		if(nums.length==0)
			return count;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=val){
				nums[count]=nums[i];
				count++;
			}
		}
		return count;
    }
}
