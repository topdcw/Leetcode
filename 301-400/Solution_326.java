package com.dcw.leetcode;
/**
 * Power of Three 
 * ��int��Χ������3����(1162261467)��ֵȥ%n��
 * ���==0����n��3�����ɴ���
 * @author topdc
 *
 */

public class Solution_326 {
	public boolean isPowerOfThree(int n) {
        if(n>0&&1162261467%n==0)
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
