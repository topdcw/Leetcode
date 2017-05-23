package com.dcw.leetcode;

/**
 * Student Attendance Record I
 * 超过1个A或者有三个连续的L返回false
 * @author topdc
 *
 */
public class Solution_551 {
	public boolean checkRecord(String s) {
        int countA=0;
        int countL=0;
        for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='A')
				countA++;
			if(s.charAt(i)=='L')
				countL++;
			else
				countL=0;
				
			if(countA==2||countL==3)
				return false;
		}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
