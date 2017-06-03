package com.dcw.leetcode;
/**
 *  Number of 1 Bits
 *  1,方法一，转化为二进制字符串，计算1的个数
 *  2，方法二，每次用n与1进行与运算，如果最低位是1，则结果是1，再把n进行无符号右移一位。直至n=0结束循环 
 * @author topdc
 *
 */
public class Solution_191 {

	// you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    	int ret=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<=s.length();i++)
        	if(s.charAt(i)=='1')
        		ret++;
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
