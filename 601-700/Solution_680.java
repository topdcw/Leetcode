package com.dcw.leetcode;

public class Solution_680 {
	public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        boolean res=true;
        while(i<j){
        	if(s.charAt(i)!=s.charAt(j)){
        		String tmp1=s.substring(i, j);//不包含j的子串
        		String tmp2=s.substring(i+1,j+1);//不包含i的子串
        		int m=0,n=tmp1.length()-1;
        		while(m<n){
        			if(tmp1.charAt(m)!=tmp1.charAt(n)){
        				res=false;
        				break;
        			}
        			else{
        				m++;
        				n--;
        			}
        		}
        		if(res)
        			return res;
        		
        		m=0;
        		n=tmp2.length()-1;
        		res=true;
        		while(m<n){
        			if(tmp2.charAt(m)!=tmp2.charAt(n)){
        				res=false;
        				break;
        			}
        			else{
        				m++;
        				n--;
        			}
        		}
        		return res;
        	}
        	else{
        		i++;
        		j--;
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
