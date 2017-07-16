package com.dcw.leetcode;

/**
 * Factorial Trailing Zeroes  
 * n的阶乘的尾随0的个数。
 * 0的个数和2和5有关。结果与因数5和2的个数有关。
 * 最后的结果就是5的个数和2的个数的较小者
 * 但2的个数是肯定比5的个数大的，所以只需要计算5个个数即可。
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
