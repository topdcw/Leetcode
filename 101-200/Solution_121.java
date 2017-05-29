package com.dcw.leetcode;
/**
 * Best Time to Buy and Sell Stock
 * 给出股票价格表，问只有一次买和卖的最大受益
 * 思路：先确定一个最小值，然后计算到比这个最小值更小的值并更新最小值，再依次计算。
 * @author topdc
 *
 */
public class Solution_121 {
	public int maxProfit(int[] prices) {
        int ret=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
        	min=prices[i]<min?prices[i]:min;
        	ret=ret<prices[i]-min?prices[i]-min:ret;
        }
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
