package com.dcw.leetcode;

/**
 * Container With Most Water
 * ���Խⷨ��
 * ������ָ��i��j�ֱ�ָ��ͷ��β�� ���a[i]<a[j], ��i++,����j--:
 *	֤����
 *	������k<j��
 *	����(k-i)*min(a[k],a[i]) < (j-i)min(a[j],a[i]) = (j-i)a[i]
 *	��Ϊ��
 *	(k-i) < (j-i)
 *	min(a[k],a[i]) < a[i] < min(a[j],a[i])
 *
 *	���Դ�������ƶ�jֻ�ܵõ���С��ֵ�� �ƶ�j���ã� ֻ���ƶ�i�� ��֮��Ȼ��
 * @author topdc
 *
 */
public class Solution_11 {
	
	public int maxArea(int[] height) {
		int n = height.length;
		int i=0,j=n-1;
		int max=0,tmp=0;
		while(i<j){
			tmp=(height[i]<height[j]?height[i]:height[j])*(j-i);
			max=tmp>max?tmp:max;
			if(height[i]<height[j])
				i++;
			else
				j--;
		}
		return max;
    }
}
