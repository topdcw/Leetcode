package com.dcw.leetcode;

import java.util.HashMap;

/**
 * Single Number
 * 由于只有一个单独的数，其余都是重复一次，所以使用异或运算
 * @author Dong
 *
 */
public class Solution_136 {
	
	public int singleNumber(int[] nums) {
		int ret=0;
		for (int i = 0; i < nums.length; i++) {
			ret^=nums[i];
		}
		return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
