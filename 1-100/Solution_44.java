package com.dcw.leetcode;

/**
 * Wildcard Matching
 * ���ֵݹ�ķ����ᳬʱ
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
		
		//��һ����Ϊ*
		if(p.charAt(0)!='*'){
			if(s.isEmpty())
				return false;
			else{
				if(s.charAt(0)==p.charAt(0)||p.charAt(0)=='?')//��һλƥ��
					return isMatch(s.substring(1),p.substring(1));
				else
					return false;
			}
		}
		else{//��һλ��*
			//����������*����ֻ�����һ������pΪa************b,���º���Ļع��������
			while(p.length()>1&&(p.charAt(0)==p.charAt(1))){
				p=p.substring(1);
			}
			//pֻʣ��һ��*
			if(p.equals("*"))
				return true;
			
			if(s.isEmpty()){//���sΪ��
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
