package com.dcw.leetcode;
/**
 * Best Time to Buy and Sell Stock
 * ������Ʊ�۸����ֻ��һ����������������
 * ˼·����ȷ��һ����Сֵ��Ȼ����㵽�������Сֵ��С��ֵ��������Сֵ�������μ��㡣
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
