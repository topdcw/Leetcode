package com.dcw.leetcode;

import java.util.Arrays;

/**
 * Array Partition I
 * ˼·����nums�������У�ȡ��������ӡ�
 * @author Dong
 *
 */
public class Solution_561 {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int ret=0;
		for (int i = 0; i < nums.length; i+=2) {
			ret+=nums[i];
		}
		return ret;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
