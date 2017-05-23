package com.dcw.leetcode;

/**
 * Remove Duplicates from Sorted Array
 * 既然是排序好的，就从头开始遍历，count用于计数,初始为0,表示第一个空位置。
 * 如果nums[i]和nums[i+1]不相同并将nums[i]存在nums[count]的位置,count++；
 * 最后把nums[nums.length-1]存在nums[count]位置上。count++；
 * @author topdc
 *
 */
public class Solution_26 {

	public int removeDuplicates(int[] nums) {
		int count=0;
		if(nums.length==0)
			return count;
		
		for(int i =0 ;i<nums.length-1;i++){
			if(nums[i]!=nums[i+1]){
				nums[count]=nums[i];
				count++;
			}			
		}
		nums[count]=nums[nums.length-1];
		count++;
		return count;
        
    }
}

