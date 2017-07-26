package com.dcw.leetcode;

/**
 * Excel Sheet Column Title
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * 思路：就是将10进制转为27进制。A表示1，Z表示26。关键在于没有0存在。
 * 先判断是不是26的整数倍，因为没有0的存在，如果是26的整数倍，则进位为n=（n/26）-1,反之n/=26
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
