package com.dcw.leetcode;
/**
 * Power of Three 
 * 让int范围内最大的3的幂(1162261467)的值去%n，
 * 如果==0，则n是3的若干次幂
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
