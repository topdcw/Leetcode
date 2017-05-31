package com.dcw.leetcode;

/**
 * Climbing Stairs
 * 使用动态规划
 * data[i]=data[i-1]+data[i-2]
 * @author topdc
 *
 */
public class Solution_70 {
	public int climbStairs(int n) {
		int []data=new int[n+1];
        if(n==1)
        	return 1;
        if(n==2)
        	return 2;
        data[1]=1;
        data[2]=2;
        for(int i=3;i<=n;i++){
        	data[i]=data[i-1]+data[i-2];
        }
        return data[n];
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
