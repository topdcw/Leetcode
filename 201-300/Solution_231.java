package com.dcw.leetcode;

/**
 * Power of Two
 * ��int��Χ������2����(1073741824)��ֵȥ%n��
 * ���==0����n��2�����ɴ���
 * @author topdc
 *
 */
public class Solution_231 {
	public boolean isPowerOfTwo(int n) {
		if(n>0&&1073741824%n==0)
        	return true;
        else
        	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
