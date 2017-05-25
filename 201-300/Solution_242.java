package com.dcw.leetcode;

/**
 * Valid Anagram  
 * 先将s的信息存入data数组中，数组的下标表示单词，值表示出现次数。
 * 然后将t与data比对，对应字母位置-1，若s和t是同字母异序词，则data数组是全零。
 * @author Dong
 *
 */
public class Solution_242 {

	public boolean isAnagram(String s, String t) {
        //利用hash思想
		int []data=new int[26];
		for (int i = 0; i < s.length(); i++) {//将s存入data中
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
