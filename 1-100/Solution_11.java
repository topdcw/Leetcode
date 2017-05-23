package com.dcw.leetcode;

/**
 * Container With Most Water
 * 线性解法：
 * 有两个指针i和j分别指向头和尾， 如果a[i]<a[j], 则i++,否则j--:
 *	证明：
 *	对任意k<j：
 *	都有(k-i)*min(a[k],a[i]) < (j-i)min(a[j],a[i]) = (j-i)a[i]
 *	因为：
 *	(k-i) < (j-i)
 *	min(a[k],a[i]) < a[i] < min(a[j],a[i])
 *
 *	所以此种情况移动j只能得到更小的值， 移动j无用， 只能移动i。 反之亦然。
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
