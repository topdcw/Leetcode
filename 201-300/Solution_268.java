package com.dcw.leetcode;

import java.util.Arrays;

/**
 * Missing Number
 * �������е����ʣ�0-n֮��ȱ��һ�����ò�ȱ���ܺ�n(n+1)/2��ȥ���������ֵ��ܺͣ�����ȱ�ٵ��Ǹ����֡�
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
