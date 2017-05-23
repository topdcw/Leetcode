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
		//���������ж�
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
			
			/*
			 * �����õݹ飬���÷ֶη�ʽ������*��λ�ã���p�ָ�Ϊ���ɶΣ����β鿴������s���Ƿ�˳��ƥ��
			 * ��ƥ��Ļ��򷵻�false
			*/
			//��p�ֶ�,��*Ϊ���
			List<String> slist =new ArrayList<String>();
			
			for(int i=0;i<p.length();i++){
				//��p������������*����Ϊ1��
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
				String s1= p.substring(i+1, j);//ȡ����*��֮���
				slist.add(s1);
				i=j-1;
			}
//			for (String string : slist) {
//				System.out.println(string);
//			}
			
			//ƥ�����
			if(p.charAt(p.length()-1)=='*'){//p�����һ���ַ���*��
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
	
	//��ͨ���?��ģʽ�Ӵ�ƥ��,���ص�һ�� ƥ�䵽��λ��
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
			if(k==p.length())//ƥ�����
				return i;
		}
		//δ����ƥ��
		return -1;
	}
	
}
