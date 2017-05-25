package com.dcw.leetcode;

/**
 * Valid Anagram  
 * �Ƚ�s����Ϣ����data�����У�������±��ʾ���ʣ�ֵ��ʾ���ִ�����
 * Ȼ��t��data�ȶԣ���Ӧ��ĸλ��-1����s��t��ͬ��ĸ����ʣ���data������ȫ�㡣
 * @author Dong
 *
 */
public class Solution_242 {

	public boolean isAnagram(String s, String t) {
        //����hash˼��
		int []data=new int[26];
		for (int i = 0; i < s.length(); i++) {//��s����data��
			data[s.charAt(i)-'a']+=1;
		}
		for (int i = 0; i < t.length(); i++) {
			data[t.charAt(i)-'a']-=1;
		}
		
		for (int i = 0; i < data.length; i++) {
			if(data[i]!=0)
				return false;
		}
		return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
