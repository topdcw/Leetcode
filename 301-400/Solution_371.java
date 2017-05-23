package com.dcw.leetcode;
/**
 * Sum of Two Integers
 * 不能使用加号和减号
 * @author Dong
 *
 */
public class Solution_371 {

	public int getSum(int a, int b) {
		while(b!=0){
			int c=(a&b)<<1;//1次加法所带来的进位
			a=a^b;//1次加法不进位的结果
			b=c;
		}
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1^7);
	}

}
