package com.dcw.leetcode;

import java.util.HashSet;

/**
 * Distribute Candies
 * 使用hash来解决问题
 * @author Dong
 *
 */
public class Solution_575 {

	public int distributeCandies(int[] candies) {
        HashSet<Integer> hs=new HashSet<>();
        int ret=0;
        //计算有多少种不同的糖果
        for (int i = 0; i < candies.length; i++) {
			if(!hs.contains(candies[i])){
				hs.add(candies[i]);
				ret++;
			}
		}
        //因为是平分，如果ret>糖果数的一半，则返回糖果数的一半，表示能分得的最大种类数
        if(ret<=candies.length/2)
        	return ret;
        else
        	return candies.length/2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
