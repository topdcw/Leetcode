package com.dcw.leetcode;

/**
 * Number Complement
 * �Ƚ�����ת��Ϊ2���ƴ���Ȼ���󲹡��ٰ���õĲ���ת��Ϊʮ������
 * @author Dong
 *
 */
public class Solution_476 {

	public int findComplement(int num) {
		String s=Integer.toBinaryString(num);
		char []ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[i]=(char) ('1'-(ch[i]-'0'));	
		}
		
		return Integer.valueOf(String.valueOf(ch), 2);//��2������ת��Ϊ10������
	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_476 s=new Solution_476();
		
		System.out.println(s.findComplement(1));
	}

}
