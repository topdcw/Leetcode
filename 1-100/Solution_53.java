package com.dcw.leetcode;
/**
 * Maximum Subarray
 * 1.��ͷ��ʼ����ͷ��β����Ŀ�����飬���Խ���������ҷָ�Ϊ�����Ӵ���
 * ʹ�ó������һ���Ӵ�֮�⣬�����Ӵ��ĸ�Ԫ��֮��С��0��ͬʱ�õ����Ӵ�
 * �����ǰ׺�ͣ�Ȼ��Ƚϸ��Ӵ������ǰ׺�ͣ��õ����մ�
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
				cur_max=0;//��0��������һ���Ӵ������ǰ׺
			}	
		}
        return ret;
    }
}
