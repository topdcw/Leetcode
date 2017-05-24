package com.dcw.leetcode;

/**
 * Best Time to Buy and Sell Stock II  
 * 思路：贪心算法
 * 对于一个股票的价格走势，多次买入卖出使收益最大。
 * 目标就是找出这个股市波动曲线中一段段的上升曲线，对于每一个上升曲线，计算其收益，最后受益相加
 * @author Dong
 *
 */
public class Solution_122 {
	
	public int maxProfit(int[] prices) {
        int ret=0;
        for(int i=1;i<prices.length;i++){
        	ret+=prices[i]>prices[i-1]?prices[i]-prices[i-1]:0;
        }
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
