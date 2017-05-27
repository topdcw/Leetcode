package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert a Number to Hexadecimal
 * ���ü�������������ǰ������洢����ת��
 * @author topdc
 *
 */
public class Solution_405 {

	public String toHex(int num) {
		if(num==0)
			return "0";
		char []data=new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		StringBuilder ret=new StringBuilder();
		while(num!=0){
			ret.insert(0, data[num&15]);//ȡ����λ
			num=(num>>>4);//�޷�������4λ
		}
		return ret.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_405 s=new Solution_405();
		System.out.println(s.toHex(-1));
	}

}
