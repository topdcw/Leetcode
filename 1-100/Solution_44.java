package com.dcw.leetcode;

/**
 * Wildcard Matching
 * 这种递归的方法会超时
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * @author topdc
 *
 */
public class Solution_44 {
	public int count=0;
	public boolean isMatch(String s, String p) {
		
		if(p.length()==0){
			return s.isEmpty();
		}
		
		if(p.length()==1){
			if(p.equals("*")||(s.length()==1&&(s.charAt(0)==p.charAt(0)||p.charAt(0)=='?')))
				return true;
			else
				return false;
		}
		
		//第一个不为*
		if(p.charAt(0)!='*'){
			if(s.isEmpty())
				return false;
			else{
				if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='?')//第一位匹配
					return isMatch(s.substring(1),p.substring(1));
				else
					return false;
			}
		}
		else{//第一位是*
			//若是连续的*，则只从最后一个算起。p为a************b,导致后面的回归次数过多
			while(p.length()>1&&(p.charAt(0)==p.charAt(1))){
				p=p.substring(1);
			}
			//p只剩下一个*
			if(p.equals("*"))
				return true;
			
			if(s.isEmpty()){//如果s为空
				return isMatch(s, p.substring(1));
			}
			else{
				while(!s.isEmpty()){
					if(isMatch(s, p.substring(1)))
						return true;
					s=s.substring(1);
					count++;
				}
			}
			
		}		
		
		return false;
        
    }
}
