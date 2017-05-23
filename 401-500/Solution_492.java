package com.dcw.leetcode;

/**
 * Construct the Rectangle
 * ���ŵĳ�������ƣ�W<=L,��W��L�����ܵĽӽ�
 * ˼·����������ĸ��ţ��ҵ�W����󷵻�
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
