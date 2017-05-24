package com.dcw.leetcode;

/**
 * Excel Sheet Column Number
 * 26进制转10进制
 * @author Dong
 *
 */
public class Solution_171 {

	public int titleToNumber(String s) {
		if(s.length()==0)
			return 0;
        int ret=s.charAt(s.length()-1)-'A'+1;//最低位的值
        for (int i = s.length()-2,j=1;i>=0; i--,j++) {
        	int tmp=1;
        	System.out.println(i);
        	for(int k=1;k<=j;k++){
        		tmp*=26;//权重
        	}
        	ret+=(s.charAt(i)-'A'+1)*tmp;
		}
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((new Solution_171()).titleToNumber("AA"));
	}

}
