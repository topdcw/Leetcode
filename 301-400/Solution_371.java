package com.dcw.leetcode;
/**
 * Sum of Two Integers
 * ����ʹ�üӺźͼ���
 * @author Dong
 *
 */
public class Solution_371 {

	public int getSum(int a, int b) {
		while(b!=0){
			int c=(a&b)<<1;//1�μӷ��������Ľ�λ
			a=a^b;//1�μӷ�����λ�Ľ��
			b=c;
		}
		return a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1^7);
	}

}
