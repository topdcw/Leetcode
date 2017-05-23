package com.dcw.leetcode;

/**
 * Nim Game
 * 倒着数每四个化为一组，谁取出的最后一个是这组的最后一个，则能赢
 * @author Dong
 *
 */
public class Solution_292 {
	public boolean canWinNim(int n) {
		int remain=n%4;
		if(remain==0)
			return false;
        
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
