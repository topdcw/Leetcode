package com.dcw.leetcode;

/**
 * Excel Sheet Column Number
 * 26����ת10����
 * @author Dong
 *
 */
public class Solution_171 {

	public int titleToNumber(String s) {
		if(s.length()==0)
			return 0;
        int ret=s.charAt(s.length()-1)-'A'+1;//���λ��ֵ
        for (int i = s.length()-2,j=1;i>=0; i--,j++) {
        	int tmp=1;
        	System.out.println(i);
        	for(int k=1;k<=j;k++){
        		tmp*=26;//Ȩ��
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
