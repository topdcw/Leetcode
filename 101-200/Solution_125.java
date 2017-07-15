package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Valid Palindrome
 *��ȥ��������ĸ�����ֵ��ַ�����б��У����ж��ǲ��ǻ��ġ�
 * @author dong
 *
 */
public class Solution_125 {
	public boolean isPalindrome(String s) {
		StringBuilder str=new StringBuilder();   
		for (int i = 0; i < s.length(); i++) {
			if(Character.isLetter(s.charAt(i))||Character.isDigit(s.charAt(i)))
				str.append(s.charAt(i));
		}
	    String ret=str.toString().toLowerCase();
	    int mid=ret.length()/2;
	    for (int i = 0; i < mid; i++) {
	        if(ret.charAt(i)!=ret.charAt(ret.length()-1-i))
	        	return false;
		}
	    return true;
	        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.isDigit('1'));
	}

}
