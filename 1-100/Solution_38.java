package com.dcw.leetcode;

/**
 * Count and Say
 * 思路：依次计算n的前面的数，最后计算第n个数所对应的值
 * 为了防止溢出，除输入为int为，其他均采用string类型
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
