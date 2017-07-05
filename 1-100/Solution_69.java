package com.dcw.leetcode;
/**
 * Sqrt(x)
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * 有一个规则是x的平方根小于等于x/2+1,使用二分法
 * @author topdc
 *
 */
public class Solution_69 {
	public int mySqrt(int x) {
		if(x==0||x==1)
			return x;
        int left=1;
        int right=x/2+1;
        while(left<=right){
        	int mid=(left+right)/2;
        	if(x/mid==mid){
        		return mid;
        	}
        	else{
        		if(x/mid>mid){
        			left=mid+1;
        		}
        		else{
        			right=mid-1;
        		}
        	}
        }
        return right;
    }
}
