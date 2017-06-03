package com.dcw.leetcode;
/**
 * Maximum Subarray
 * 1.从头开始，从头到尾遍历目标数组，可以将数组从左到右分割为若干子串，
 * 使得除了最后一个子串之外，其余子串的各元素之和小于0，同时得到各子串
 * 的最大前缀和，然后比较各子串的最大前缀和，得到最终答案
 * @author topdc
 *
 */
public class Solution_53 {
	public int maxSubArray(int[] nums) {
        int ret=Integer.MIN_VALUE;
        int cur_max=0;
        
        for (int i = 0; i < nums.length; i++) {
			cur_max+=nums[i];
			if(cur_max>ret)
				ret=cur_max;
			if(cur_max<0){
				cur_max=0;//置0，计算下一个子串的最大前缀
			}	
		}
        return ret;
    }
}
