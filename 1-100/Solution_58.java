package com.dcw.leetcode;

/**
 *  Length of Last Word
 *  �ҳ����һ�����ʵĳ���
 * @author topdc
 *
 */
public class Solution_58 {

	public int lengthOfLastWord(String s) {
        int ret=0;
        //���ų��������Ŀո�
        int j=s.length()-1;
        while(j>=0){
        	if(s.charAt(j)==' ')
        		j--;
        	else
        		break;
        }
        for(int i=j;i>=0;i--){
        	if(s.charAt(i)!=' ')
        		ret++;
        	else
        		return ret;
        }
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Solution_58()).lengthOfLastWord("a"));
	}

}
