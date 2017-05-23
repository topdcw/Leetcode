package com.dcw.leetcode;

/**
 * Find the Difference   
 *  π”√“ÏªÚ
 * @author Dong
 *
 */
public class Solution_389 {
	public char findTheDifference(String s, String t) {
        int s_len=s.length();
        int t_len=t.length();
        char ret=0;
		for (int i = 0; i < s_len; i++) {
			ret^=s.charAt(i);
		}
		for (int i = 0; i < t_len; i++) {
			ret^=t.charAt(i);
		}
		return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_389 s=new Solution_389();
		System.out.println(s.findTheDifference("123", "1234"));
	}

}
