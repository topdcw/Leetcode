package com.dcw.leetcode;

/**
 * Reverse Bits
 * 
 * @author topdc
 *
 */
public class Solution_190 {

	// you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret=0;
        System.out.println(Integer.toBinaryString(n));
        for(int i=1;i<=32;i++){//retֻ��Ҫ��λ31��
        	ret=ret<<1;//�Ȼ����������λ����֤�����һ�λ����������λ
        	ret=ret^(n&0x1);
        	n=n>>1;
        }
        	
        System.out.println(Integer.toBinaryString(ret));
        return ret;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.toBinaryString());
		Solution_190 s=new Solution_190();
		System.out.println(s.reverseBits(43261596));
	}

}
