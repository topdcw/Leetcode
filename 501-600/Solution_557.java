package com.dcw.leetcode;


/**
 * Reverse Words in a String III
 * 先转化为字符数组，然后对每一块进行翻转
 * @author Dong
 *
 */
public class Solution_557 {

	public String reverseWords(String s) {
		char []str=s.toCharArray();
		int from=0; 
		for (int i=0;i<str.length;i++) {
			if(i==str.length-1||str[i+1]==' '){
				reversecharArray(str, from, i);
				from=i+2;
			}
		}
		return String.valueOf(str);
    }
	
	public void reversecharArray(char[] ch,int from,int to){
		while(from<to){
			char tmp=ch[from];
			ch[from++]=ch[to];
			ch[to--]=tmp;
		}
	}
	
	public static void main(String[] args) {
		Solution_557 s=new Solution_557();
		System.out.println(s.reverseWords("i am dcw"));
	}
}

