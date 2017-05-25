package com.dcw.leetcode;

import java.util.HashMap;

/**
 * Longest Palindrome 
 * 
 * @author Dong
 *
 */
public class Solution_409 {
	public int longestPalindrome(String s) {
		//先存入hashmap，出现两次即可构成回文的一部分
        HashMap<Character, Integer> hm=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
			if(hm.containsKey(s.charAt(i)))
				hm.put(s.charAt(i),	hm.get(s.charAt(i))+1);
			else
				hm.put(s.charAt(i),	1);
		}
        Integer[] in= hm.values().toArray(new Integer[0]);
        int ret=0;
        for (Integer integer : in) {
			ret+=integer/2;
		}
        if(ret*2==s.length())
        	return s.length();
        else
        	return ret*2+1;
        
    }
}
