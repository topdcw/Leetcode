package com.dcw.leetcode;

/**
 * Ugly Number  
 * 依次整除2、3、5看最后结果是不是1。
 * @author topdc
 *
 */
public class Solution_263 {
	 public boolean isUgly(int num) {
		 if(num<=0)
			 return false;
		 while(num%2==0)
			 num/=2;
		 while(num%3==0)
			 num/=3;
		 while(num%5==0)
			 num/=5;
		 if(num==1)
			 return true;
		 else
			 return false;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
