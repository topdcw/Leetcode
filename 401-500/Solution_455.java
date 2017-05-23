package com.dcw.leetcode;

import java.util.Arrays;

/**
 * Assign Cookies 
 * 
 * @author Dong
 *
 */
public class Solution_455 {
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ret=0;
        for(int i=0,j=0;i<g.length&&j<s.length;){
        	if(s[j]>=g[i]){
        		j++;
        		i++;
        		ret+=1;
        	}
        	else{
        		j++;
        	}
        }
		return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
