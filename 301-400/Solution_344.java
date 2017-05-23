package com.dcw.leetcode;

/**
 * Reverse String   
 * 转化为数组进行翻转
 * @author Dong
 *
 */
public class Solution_344 {

	public String reverseString(String s) {
        char chs[]=s.toCharArray();
        int from=0;
        int end=chs.length-1;
        char tmp;
        while(from<end){
        	tmp=chs[from];
        	chs[from++]=chs[end];
        	chs[end--]=tmp;
        }
        return String.valueOf(chs);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
