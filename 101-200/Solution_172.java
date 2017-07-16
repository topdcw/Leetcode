package com.dcw.leetcode;

/**
 * Factorial Trailing Zeroes  
 * n�Ľ׳˵�β��0�ĸ�����
 * 0�ĸ�����2��5�йء����������5��2�ĸ����йء�
 * ���Ľ������5�ĸ�����2�ĸ����Ľ�С��
 * ��2�ĸ����ǿ϶���5�ĸ�����ģ�����ֻ��Ҫ����5���������ɡ�
 * @author topdc
 *
 */
public class Solution_172 {
	private int num_2=0;
    private int num_5=0;
	public int trailingZeroes(int n) {
        int ret=0;
        while(n!=0){
        	ret+=n/5;
        	n/=5;
        }
        return ret;
		
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
