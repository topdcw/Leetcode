package com.dcw.leetcode;

/**
 * Number Complement
 * 先将数字转化为2进制串，然后求补。再把求得的补数转化为十进制数
 * @author Dong
 *
 */
public class Solution_476 {

	public int findComplement(int num) {
		String s=Integer.toBinaryString(num);
		char []ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char) ('1'-(ch[i]-'0'));	
		}
		
		return Integer.valueOf(String.valueOf(ch), 2);//将2进制数转化为10进制数
	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_476 s=new Solution_476();
		
		System.out.println(s.findComplement(1));
	}

}
