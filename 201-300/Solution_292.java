package com.dcw.leetcode;

/**
 * Nim Game
 * ������ÿ�ĸ���Ϊһ�飬˭ȡ�������һ������������һ��������Ӯ
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
