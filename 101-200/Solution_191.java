package com.dcw.leetcode;
/**
 *  Number of 1 Bits
 *  1,����һ��ת��Ϊ�������ַ���������1�ĸ���
 *  2����������ÿ����n��1���������㣬������λ��1��������1���ٰ�n�����޷�������һλ��ֱ��n=0����ѭ�� 
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
