package com.dcw.leetcode;
/**
 * Longest Uncommon Subsequence I   
 * 
 * @author Dong
 *
 */
public class Solution_521 {

	public int findLUSlength(String a, String b) {
        if(a.length()>b.length()){
        	return a.length();
        }
        if(a.length()<b.length()){
        	return b.length();
        }
        if(a.equals(b))
        	return -1;
        return a.length();
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
