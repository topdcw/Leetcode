package com.dcw.leetcode;


/**
 * Divide Two Integers
 * 不得使用*，/，%运算符，可使用移位运算符进行加速
 * 1，利用long类型防止溢出，这步非常关键
 * 2，将除数左移，直至大于被除数，得到新值tmp，并记录左移值c，即扩大了多少倍。
 * 3，定义结果ret=0，（大循环）若被除数大于原始的除数，（且大于tmp，则ret+=c，被除数-=tmp，这步是个小循环）
 * 结束小循环tmp缩小2倍，c缩小2倍。
 * 
 * 4，原理：若除数乘以2的n+1次方>被除数，除数乘以2的n次方<被除数
 * 则依次用除数乘以2的n次方，n-1次方到0次方与被除数比较，用被除数减去他们
 * （这些2^n等等的和，即被除数包含了多少了除数），最后得到结果。
 * @author topdc
 *
 */
public class Solution_29 {
	
	public int divide(int dividend, int divisor) {//被除数，除数
		if(dividend==Integer.MIN_VALUE&&divisor==-1)
			//如果被除数是int型最小负数，除数是-1，会导致结果溢出，返回最大int正数。
			return Integer.MAX_VALUE;
		if(dividend == 0)
			return 0;
		
		//利用<<移位符进行运算。
		long c=1;
		
		int sign=0;//用于表示结果符号
		if((dividend>0&&divisor>0)||(dividend<0&&divisor<0))
			sign=1;

		//为防止处理过程中溢出，转换为long类型,正数
		long beichushu=Math.abs((long)dividend);
		long tmp=Math.abs((long)divisor);
		
		while(tmp<beichushu){
			c=c<<1;//相当于乘以2
			tmp=tmp<<1;
		}
		int ret=0;
		while(beichushu>=Math.abs((long)divisor)){
			while(beichushu>=tmp){
				beichushu-=tmp;
				ret+=c;
			}
			tmp=tmp>>1;
			c=c>>1;
		}
		if(sign>0)
			return ret;
		else
			return -ret;
		
    }
}
