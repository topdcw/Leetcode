package com.dcw.leetcode;

/**
 * Count and Say
 * ˼·�����μ���n��ǰ��������������n��������Ӧ��ֵ
 * Ϊ�˷�ֹ�����������ΪintΪ������������string����
 * @author topdc
 *
 */
public class Solution_38 {
	public String countAndSay(int n) {
		String res="1";
		for(int i =1;i<n;i++){
			res=readN(res);
		}
		return res;
    }
	private String readN(String str){
		String res="";
		int count=1;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)!=str.charAt(i+1)){
				res=res+String.valueOf(count)+str.charAt(i);
				count=1;
			}
			else{
				count++;
			}
		}
		res=res+String.valueOf(count)+str.charAt(str.length()-1);
		return res;
	}
}
