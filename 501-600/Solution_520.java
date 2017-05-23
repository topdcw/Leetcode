package com.dcw.leetcode;

/**
 * Detect Capital
 * 第一个字母大写、全大写、全小写
 * @author Dong
 *
 */
public class Solution_520 {

	public boolean detectCapitalUse(String word) {
		int firstC=0;
		if(word.charAt(0)>='A'&&word.charAt(0)<='Z')
			firstC=1;
		int Bflag=0;
		int Sflag=0;//表示是否存在大小写
		for (int i = 1; i < word.length(); i++) {//后面的字母要么全是大写要么全是小写
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
