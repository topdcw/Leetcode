package com.dcw.leetcode;


/**
 * Longest Common Prefix
 * 先求出各个字符串长度。获得最短值，则公共前缀必定小于或等于这个最短值
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
