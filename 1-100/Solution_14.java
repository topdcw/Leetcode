package com.dcw.leetcode;


/**
 * Longest Common Prefix
 * ����������ַ������ȡ�������ֵ���򹫹�ǰ׺�ض�С�ڻ����������ֵ
 * 
 * 
 * @author topdc
 *
 */
public class Solution_14 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0)
			return "";
		int n=strs[0].length();
		String s="";
		for(int i=0;i<strs.length;i++)
			if(n>strs[i].length())
				n=strs[i].length();
		
		if(n==0)
			return "";
		for(int i=0;i<n;i++){
			for(int j=0;j<strs.length-1;j++){
				if(strs[j].charAt(i)!=strs[j+1].charAt(i))
					return s;
					
			}
			s+=strs[0].charAt(i);
		}
		return s;
    }
}
