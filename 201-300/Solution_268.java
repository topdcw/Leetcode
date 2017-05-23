package com.dcw.leetcode;

import java.util.Arrays;

/**
 * Missing Number
 * 利用数列的性质，0-n之间缺少一个，用不缺的总和n(n+1)/2减去给出的数字的总和，就是缺少的那个数字。
 * @author topdc
 *
 */
public class Solution_268 {

	public int missingNumber(int[] nums) {
		int sum=0;
        for (int i : nums) {
			sum+=i;
		}
        return nums.length*(nums.length+1)/2-sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Solution_268 s=new Solution_268();
		 s.missingNumber(new int[]{3,1,2,4,5,0});
	}

}
