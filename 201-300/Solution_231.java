package com.dcw.leetcode;

/**
 * Power of Two
 * 让int范围内最大的2的幂(1073741824)的值去%n，
 * 如果==0，则n是2的若干次幂
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
