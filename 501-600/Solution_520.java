package com.dcw.leetcode;

/**
 * Detect Capital
 * ��һ����ĸ��д��ȫ��д��ȫСд
 * @author Dong
 *
 */
public class Solution_520 {

	public boolean detectCapitalUse(String word) {
		int firstC=0;
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
			firstC=1;
		int Bflag=0;
		int Sflag=0;//��ʾ�Ƿ���ڴ�Сд
		for (int i = 1; i < word.length(); i++) {//�������ĸҪôȫ�Ǵ�дҪôȫ��Сд
			if(word.charAt(i)>='a'&&word.charAt(i)<='z')
				Sflag=1;
			else
				Bflag=1;
			if((Bflag==1&&Sflag==1)||(firstC==0&&Bflag==1))
				return false;
		}
		return true;
    }
	public static void main(String[] args) {
		
	}
}
