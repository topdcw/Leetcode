package com.dcw.leetcode;

/**
 * Add Digits  
 * 
 * @author Dong
 *
 */
public class Solution_258 {
	public int addDigits(int num) {
        while(num/10!=0){
        	int tmp=0;
        	while(num!=0){
        		tmp+=num%10;
        		num/=10;
        	}
        	num=tmp;
        }
        return num;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_258 s=new Solution_258();
		System.out.println(s.addDigits(38));
	}

}
