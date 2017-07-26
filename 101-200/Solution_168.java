package com.dcw.leetcode;

/**
 * Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * ˼·�����ǽ�10����תΪ27���ơ�A��ʾ1��Z��ʾ26���ؼ�����û��0���ڡ�
 * ���ж��ǲ���26������������Ϊû��0�Ĵ��ڣ������26�������������λΪn=��n/26��-1,��֮n/=26
 * @author dong
 *
 */
public class Solution_168 {
	
	public String convertToTitle(int n) {
        char []flag={'Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y'};
    
        StringBuilder ret=new StringBuilder();
        while(n!=0){
        	ret.append(flag[n%26]);
        	if(n%26==0)
        		n=(n/26)-1;
        	else
        		n/=26;        		
        }
        return ret.reverse().toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution_168 s=new Solution_168();
		System.out.println(s.convertToTitle(52));
	}

}
