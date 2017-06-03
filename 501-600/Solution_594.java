package com.dcw.leetcode;

import java.util.Arrays;
/**
 * Longest Harmonious Subsequence
 * �Ƚ�������Ȼ��ӵ�һ������������������ͬ���ļ����
 * �������1����ret������ �����������ĺ͡�
 * @author topdc
 *
 */
public class Solution_594 {
	public int findLHS(int[] nums) {
		if(nums.length==0)
			return 0;
        Arrays.sort(nums);
        int ret=0;
        //��ʼ���ǵ�һ������
        int last=nums[0],now=nums[0];//��¼�ϴ����֣�����������
        int lastnum=0,nownum=1;//��¼�ϴ����ָ��������������ָ���
        for (int i = 1; i < nums.length; i++) {
			if(nums[i]==nums[i-1])
				nownum++;
			else{
				if(now-last==1){//���������֮��Ϊ1�����и���
					if(lastnum+nownum>ret)
						ret=lastnum+nownum;
				}
				last=now;		//����last
				now=nums[i];	//����now
				lastnum=nownum;
				nownum=1;
			}
		}
        if(now-last==1){//������һ�����ֵĴ���
			if(lastnum+nownum>ret)
				ret=lastnum+nownum;
		}
        return ret;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
