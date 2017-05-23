package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Wildcard Matching
 * 
 * '?' Matches any single character.
 * '*' Matches any sequence of characters (including the empty sequence).
 * @author topdc
 *
 */
public class Solution_44_1 {

	public boolean isMatch(String s, String p){
		//特殊条件判断
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
			
			/*
			 * 不采用递归，采用分段方式：根据*的位置，将p分割为若干段，依次查看各段在s中是否顺序匹配
			 * 不匹配的话则返回false
			*/
			//将p分段,以*为间隔
			List<String> slist =new ArrayList<String>();
			
			for(int i=0;i<p.length();i++){
				//对p处理，将连续的*缩短为1个
				while(i+1<p.length()&&p.charAt(i)==p.charAt(i+1)){
					i++;
				}
				int j=i+1;
				if(j>=p.length()){
					break;
				}
				else{
					while(p.length()>j&&p.charAt(j)!='*'){
						j++;
					}
				}
				String s1= p.substring(i+1, j);//取两个*号之间的
				slist.add(s1);
				i=j-1;
			}
//			for (String string : slist) {
//				System.out.println(string);
//			}
			
			//匹配操作
			if(p.charAt(p.length()-1)=='*'){//p的最后一个字符是*号
				for(int i=0;i<slist.size();i++){
					int j=searchsub(s, slist.get(i));
					if(j==-1)
						return false;
					s=s.substring(j+slist.get(i).length());
				}
				return true;
			}
			else{
				for(int i=0;i<slist.size()-1;i++){
					int j=searchsub(s, slist.get(i));
					if(j==-1)
						return false;
					s=s.substring(j+slist.get(i).length());
				}
				if(s.isEmpty()||s.length()<slist.get(slist.size()-1).length())
					return false;
				int k=searchsub(s.substring(s.length()-slist.get(slist.size()-1).length(), s.length()), slist.get(slist.size()-1));
				if(k==-1)
					return false;
				return true;
			}
	
		}
	}
	
	//带通配符?的模式子串匹配,返回第一个 匹配到的位置
	public int searchsub(String s,String p){
		int i;
		for(i=0;i<s.length();i++){
			int j=i;
			int k;
			for(k=0;k<p.length()&&j<s.length();k++,j++){
				if(((p.charAt(k)!=s.charAt(j))&&p.charAt(k)!='?')){
					break;
				}
			}
			if(k==p.length())//匹配完成
				return i;
		}
		//未发生匹配
		return -1;
	}
	
}
