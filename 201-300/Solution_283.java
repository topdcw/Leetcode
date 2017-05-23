package com.dcw.leetcode;

/**
 *Move Zeroes
 *碰到不为0的数向前插入
 * @author Dong
 *
 */
public class Solution_283 {
	
	public void moveZeroes(int[] nums) {
        if(nums.length==0)
        	return;
        int pos=0;
        for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0)
				nums[pos++]=nums[i];
		}
        while(pos<nums.length)
        	nums[pos++]=0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
