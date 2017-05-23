package com.dcw.leetcode;


/**
 * Divide Two Integers
 * ����ʹ��*��/��%���������ʹ����λ��������м���
 * 1������long���ͷ�ֹ������ⲽ�ǳ��ؼ�
 * 2�����������ƣ�ֱ�����ڱ��������õ���ֵtmp������¼����ֵc���������˶��ٱ���
 * 3��������ret=0������ѭ����������������ԭʼ�ĳ��������Ҵ���tmp����ret+=c��������-=tmp���ⲽ�Ǹ�Сѭ����
 * ����Сѭ��tmp��С2����c��С2����
 * 
 * 4��ԭ������������2��n+1�η�>����������������2��n�η�<������
 * �������ó�������2��n�η���n-1�η���0�η��뱻�����Ƚϣ��ñ�������ȥ����
 * ����Щ2^n�ȵȵĺͣ��������������˶����˳����������õ������
 * @author topdc
 *
 */
public class Solution_29 {
	
	public int divide(int dividend, int divisor) {//������������
		if(dividend==Integer.MIN_VALUE&&divisor==-1)
			//�����������int����С������������-1���ᵼ�½��������������int������
			return Integer.MAX_VALUE;
		if(dividend == 0)
			return 0;
		
		//����<<��λ���������㡣
		long c=1;
		
		int sign=0;//���ڱ�ʾ�������
		if((dividend>0&&divisor>0)||(dividend<0&&divisor<0))
			sign=1;

		//Ϊ��ֹ��������������ת��Ϊlong����,����
		long beichushu=Math.abs((long)dividend);
		long tmp=Math.abs((long)divisor);
		
		while(tmp<beichushu){
			c=c<<1;//�൱�ڳ���2
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
