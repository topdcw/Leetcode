package com.dcw.leetcode;

/**
 * Construct the Rectangle
 * 最优的长方形设计：W<=L,且W、L尽可能的接近
 * 思路：先求面积的根号，找到W的最大返回
 * @author Dong
 *
 */
public class Solution_492 {
	
	public int[] constructRectangle(int area) {
        int max=(int)Math.sqrt(area);
        while(max>0){
        	if(area%max==0){
        		return new int[]{area/max,max};
        	}
        	max--;
        }
		return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
