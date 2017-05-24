package com.dcw.leetcode;

/**
 * Best Time to Buy and Sell Stock II  
 * ˼·��̰���㷨
 * ����һ����Ʊ�ļ۸����ƣ������������ʹ�������
 * Ŀ������ҳ�������в���������һ�ζε��������ߣ�����ÿһ���������ߣ����������棬����������
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
